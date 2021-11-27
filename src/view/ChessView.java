package view;

import java.io.InputStream;
import java.util.Observable;
import java.util.Observer;

import controller.ChessController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.ChessModel;

public class ChessView extends Application implements Observer{
	public static ChessModel model;
	public static ChessController control;
	private static boolean canClick;
	private static Stage stageInstance;
	public static GridPane gridPane;

    @Override
    public void start(Stage stage) {
        // Create a GridPane
    	Image blackBishop = new Image("images/black_bishop.png");
    	ImagePattern blackBishopIp = new ImagePattern(blackBishop);
    	Image blackKing = new Image("images/black_king.png");
    	ImagePattern blackKingIp = new ImagePattern(blackKing);
    	Image blackKnight = new Image("images/black_knight.png");
    	ImagePattern blackKnightIp = new ImagePattern(blackKnight);
    	Image blackPawn = new Image("images/black_pawn.png");
    	ImagePattern blackPawnIp = new ImagePattern(blackPawn);
    	Image blackQueen = new Image("images/black_queen.png");
    	ImagePattern blackQueenIp = new ImagePattern(blackQueen);
    	Image blackRook = new Image("images/black_rook.png");
    	ImagePattern blackRookIp = new ImagePattern(blackRook);
    	Image whiteBishop = new Image("images/white_bishop.png");
    	ImagePattern whiteBishopIp = new ImagePattern(whiteBishop);
    	Image whiteKing = new Image("images/white_king.png");
    	ImagePattern whiteKingIp = new ImagePattern(whiteKing);
    	Image whiteKnight = new Image("images/white_knight.png");
    	ImagePattern whiteKnightIp = new ImagePattern(whiteKnight);
    	Image whitePawn = new Image("images/white_pawn.png");
    	ImagePattern whitePawnIp = new ImagePattern(whitePawn);
    	Image whiteQueen = new Image("images/white_queen.png");
    	ImagePattern whiteQueenIp = new ImagePattern(whiteQueen);
    	Image whiteRook = new Image("images/white_rook.png");
    	ImagePattern whiteRookIp = new ImagePattern(whiteRook);
    	BorderPane borderPane = new BorderPane();
    	GridPane pane = new GridPane();
        //pane.setPadding(new Insets(60, 60, 60, 60));
        // Create 64 rectangles and add to pane
    	String alphabet = "ABCDEGFHI";
        int count = 0;
        double s = 75; // side of square
        for (int i = 0; i < 10; i++) {
          count++;
          for (int j = 0; j < 10; j++) {
        	VBox vbox = new VBox();
        	if (i == 0 && j != 0 && j != 9|| i == 9 && j != 0 && j != 9) {
        		String letter = String.valueOf(alphabet.charAt(j-1));
        		Label label = new Label(letter);
        		label.setFont(new Font("Cambria", 32));
        		vbox.getChildren().add(label);
        	}
        	else if (j == 0 && i != 0 && i != 9|| j == 9 && i != 0 && i != 9) {
        		String letter = String.valueOf(9-i);
        		Label label = new Label(letter);
        		label.setFont(new Font("Cambria", 32));
        		vbox.getChildren().add(label);
        	}
        	else if (i == 0 && j == 0 || i == 9 && j == 9) {
	            Rectangle square = new Rectangle(s, s, s, s);
	            square.setFill(Color.WHITE);
	            square.setStroke(Color.BLACK);
	            pane.add(square, i, j);
        	}
        	else {
	            Rectangle square = new Rectangle(s, s, s, s);
	            square.setStroke(Color.BLACK);
	            if (count % 2 == 0) {
	              square.setFill(Color.WHITE);
	            }
	            if (i == 1 && j == 1 || i == 1 && j == 8) {
	            	square.setFill(blackRookIp);
	            	//vbox = new VBox(blackBishopV);
	            }
	            if (i == 1 && j == 2 || i == 1 && j == 7) {
	            	square.setFill(blackKnightIp);
	            }
	            if (i == 1 && j == 3 || i == 1 && j == 6) {
	            	square.setFill(blackBishopIp);
	            }
	            if (i == 1 && j == 4) {
	            	square.setFill(blackQueenIp);
	            }
	            if (i == 1 && j == 5) {
	            	square.setFill(blackKingIp);
	            }
	            if (i == 2) {
	            	square.setFill(blackPawnIp);
	            }
	            if (i == 8 && j == 1 || i == 8 && j == 8) {
	            	square.setFill(whiteRookIp);
	            	//vbox = new VBox(blackBishopV);
	            }
	            if (i == 8 && j == 2 || i == 8 && j == 7) {
	            	square.setFill(whiteKnightIp);
	            }
	            if (i == 8 && j == 3 || i == 8 && j == 6) {
	            	square.setFill(whiteBishopIp);
	            }
	            if (i == 8 && j == 4) {
	            	square.setFill(whiteQueenIp);
	            }
	            if (i == 8 && j == 5) {
	            	square.setFill(whiteKingIp);
	            }
	            if (i == 7) {
	            	square.setFill(whitePawnIp);
	            }
	            vbox.getChildren().add(square);
	            //vbox.getChildren().add(blackBishopV);
        	}
            pane.add(vbox, j, i);
            count++;
          }
        }

        // Create a scene and place it in the stage
        borderPane.setCenter(pane);
        Scene scene = new Scene(borderPane, 750, 750);
        stage.setTitle("java2s.com");
        stage.setScene(scene); // Place in scene in the stage
        stage.show();
        
      }

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}

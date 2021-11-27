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
import model.Bishop;
import model.ChessModel;
import model.King;
import model.Knight;
import model.Pawn;
import model.Queen;
import model.Rook;

public class ChessView extends Application implements Observer{
	public static ChessModel model;
	public static ChessController control;
	private static boolean canClick;
	private static Stage stageInstance;
	public static GridPane pane;

    @Override
    public void start(Stage stage) {
        // Create a GridPane
    	model = new ChessModel();
    	BorderPane borderPane = new BorderPane();
    	pane = new GridPane();
    	initBoard();
        borderPane.setCenter(pane);
        Scene scene = new Scene(borderPane, 750, 750);
        stage.setTitle("Chess!");
        stage.setScene(scene); 
        stage.show();
        
      }
    
    private void initBoard() {
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
        		pane.add(vbox, i, j);
        	}
        	else if (j == 0 && i != 0 && i != 9|| j == 9 && i != 0 && i != 9) {
        		String letter = String.valueOf(9-i);
        		Label label = new Label(letter);
        		label.setFont(new Font("Cambria", 32));
        		vbox.getChildren().add(label);
        		pane.add(vbox, i, j);
        	}
        	else if (i == 0 && j == 0 || i == 9 && j == 9) {
	            Rectangle square = new Rectangle(s, s, s, s);
	            square.setFill(Color.WHITE);
	            square.setStroke(Color.BLACK);
	            pane.add(square, i, j);
        	}
        	else {
	            Rectangle square = new Rectangle(s, s, s, s);
	            square.setStroke(Color.GREY);
	            if (count % 2 == 0) {
	              square.setFill(Color.WHITE);
	            }
	            else {
	            	square.setFill(Color.GREY);
	            }
	            pane.add(square, j, i);
	            if (i == 1 && j == 1 || i == 1 && j == 8) {
	            	ImageView iv = model.blackRook.getImage();
	            	pane.add(iv, j, i);
	            	//vbox = new VBox(blackBishopV);
	            }
	            if (i == 1 && j == 2 || i == 1 && j == 7) {
	            	ImageView iv = model.blackKnight.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 1 && j == 3 || i == 1 && j == 6) {
	            	ImageView iv = model.blackBishop.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 1 && j == 4) {
	            	ImageView iv = model.blackQueen.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 1 && j == 5) {
	            	ImageView iv = model.blackKing.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 2) {
	            	ImageView iv = model.blackPawn.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 8 && j == 1 || i == 8 && j == 8) {
	            	ImageView iv = model.whiteRook.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 8 && j == 2 || i == 8 && j == 7) {
	            	ImageView iv = model.whiteKnight.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 8 && j == 3 || i == 8 && j == 6) {
	            	ImageView iv = model.whiteBishop.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 8 && j == 4) {
	            	ImageView iv = model.whiteQueen.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 8 && j == 5) {
	            	ImageView iv = model.whiteKing.getImage();
	            	pane.add(iv, j, i);
	            }
	            if (i == 7) {
	            	ImageView iv = model.whitePawn.getImage();
	            	pane.add(iv, j, i);
	            }
        	}
            count++;
          }
        }
    }

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}

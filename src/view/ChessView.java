package view;

import java.util.Observable;
import java.util.Observer;

import controller.ChessController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.ChessModel;

public class ChessView extends Application implements Observer{
	public static ChessModel model;
	public static ChessController control;
	private static boolean canClick;
	private static Stage stageInstance;
	
	@Override
	public void start(Stage stage) throws Exception {
		model = new ChessModel();
		model.addObserver(this);
		control = new ChessController();
		stageInstance = stage;
		//canClick = false; -> TO BE USED LATER
		
		BorderPane pane = new BorderPane();
		Scene scene = new Scene(pane, 300, 200);
		stage.setScene(scene);
		stage.setTitle("JavaFX Test");
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

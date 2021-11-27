package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Piece {
	private Image image;
	private static Color color;
	private static String name;
	private static boolean alive;
	
	Piece(int color, String name) {
		name = name;
		alive = true;
	}
	
	public ImageView getImage() {
		ImageView iv = new ImageView(image);
		iv.setFitHeight(60);
		iv.setFitWidth(60);
		return iv;
	}
}

package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Rook extends Piece{
	private Image image;
	public Rook(int color) {
		super(color, "rook");
		System.out.println(color);
		if (color == 2) {
			image = new Image("images/black_rook.png");
		}
		else {
			image = new Image("images/white_rook.png");
		}
	}
	
	public ImageView getImage() {
		System.out.println(image.toString());
		ImageView iv = new ImageView(image);
		iv.setFitHeight(60);
		iv.setFitWidth(60);
		return iv;
	}
	
}

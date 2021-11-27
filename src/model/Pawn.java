package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Pawn extends Piece{
	private Image image;
	Pawn(int color) {
		super(color, "pawn");
		if (color == 2) {
			this.image = new Image("images/black_pawn.png");
		}
		else {
			this.image = new Image("images/white_pawn.png");
		}
	}
	public ImageView getImage() {
		ImageView iv = new ImageView(image);
		iv.setFitHeight(60);
		iv.setFitWidth(60);
		return iv;
	}
	
}

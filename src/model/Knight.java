package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Knight extends Piece{
	private Image image;
	Knight(int color) {
		super(color, "knight");
		if (color == 2) {
			this.image = new Image("images/black_knight.png");
		}
		else {
			this.image = new Image("images/white_knight.png");
		}
	}
	public ImageView getImage() {
		ImageView iv = new ImageView(image);
		iv.setFitHeight(60);
		iv.setFitWidth(60);
		return iv;
	}
	
}

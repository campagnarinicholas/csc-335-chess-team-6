package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Queen extends Piece{
	private Image image;
	Queen(int color) {
		super(color, "queen");
		if (color == 2) {
			this.image = new Image("images/black_queen.png");
		}
		else {
			this.image = new Image("images/white_queen.png");
		}
	}
	
	public ImageView getImage() {
		ImageView iv = new ImageView(image);
		iv.setFitHeight(60);
		iv.setFitWidth(60);
		return iv;
	}
	
}

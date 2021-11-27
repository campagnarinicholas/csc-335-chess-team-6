package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Bishop extends Piece{
	private Image image;
	Bishop(int color) {
		super(color, "bishop");
		if (color == 2) {
			this.image = new Image("images/black_bishop.png");
		}
		else {
			this.image = new Image("images/white_bishop.png");
		}
	}
	public ImageView getImage() {
		ImageView iv = new ImageView(image);
		iv.setFitHeight(60);
		iv.setFitWidth(60);
		return iv;
	}
	
}

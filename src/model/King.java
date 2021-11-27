package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class King extends Piece{
	private Image image;
	King(int color) {
		super(color, "king");
		if (color == 2) {
			this.image = new Image("images/black_king.png");
		}
		else {
			this.image = new Image("images/white_king.png");
		}
	}
		public ImageView getImage() {
			ImageView iv = new ImageView(image);
			iv.setFitHeight(60);
			iv.setFitWidth(60);
			return iv;
		}
	}	

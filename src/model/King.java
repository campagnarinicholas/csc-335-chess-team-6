package model;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class King extends Piece {
	private boolean isChecked;
	private Image image;

	public King(int x, int y, int color, ArrayList<ArrayList<Piece>> board) {
		super(x, y, color, board);
		isChecked = false;
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

	@Override
	public boolean canMove(int destinationX, int destinationY) {
		// TODO: Implement Method
		return false;
	}

}


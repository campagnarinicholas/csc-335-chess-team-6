package model;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Rook extends Piece {
	private Image image;
	public Rook(int x, int y, int color, ArrayList<ArrayList<Piece>> board) {
		super(x, y, color, board);
		if (color == 2) {
			image = new Image("images/black_rook.png");
		}
		else {
			image = new Image("images/white_rook.png");
		}
	}

	@Override
	public boolean canMove(int destinationX, int destinationY) {
		// TODO: Implement Method
		return false;
	}
	
	public ImageView getImage() {
		System.out.println(image.toString());
		ImageView iv = new ImageView(image);
		iv.setFitHeight(60);
		iv.setFitWidth(60);
		return iv;
	}

}

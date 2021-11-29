package model;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public class Knight extends Piece {
	private Image image;
	public Knight(int x, int y, int color, ArrayList<ArrayList<Piece>> board) {
		super(x, y, color, board);
		if (color == 2) {
			this.image = new Image("images/black_knight.png");
		}
		else {
			this.image = new Image("images/white_knight.png");
		}
	}

	@Override
	public boolean canMove(int destinationX, int destinationY) {
		// TODO: Implement Method
		return false;
	}
	
	public ImageView getImage() {
		ImageView iv = new ImageView(image);
		iv.setFitHeight(60);
		iv.setFitWidth(60);
		return iv;
	}
}

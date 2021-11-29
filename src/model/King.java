package model;

import java.util.ArrayList;

public class King extends Piece {
	private boolean isChecked;

	public King(int x, int y, String color, ArrayList<ArrayList<Piece>> board) {
		super(x, y, color, board);
		isChecked = false;
	}

	@Override
	public boolean canMove(int destinationX, int destinationY) {
		// TODO: Implement Method
		return false;
	}

}

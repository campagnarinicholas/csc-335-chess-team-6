package model;

import java.util.ArrayList;

public class Knight extends Piece {

	public Knight(int x, int y, String color, ArrayList<ArrayList<Piece>> board) {
		super(x, y, color, board);
	}

	@Override
	public boolean canMove(int destinationX, int destinationY) {
		// TODO: Implement Method
		return false;
	}

}

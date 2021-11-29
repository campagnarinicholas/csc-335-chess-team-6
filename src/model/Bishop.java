package model;

import java.util.ArrayList;

public class Bishop extends Piece {

	public Bishop(int x, int y, int color, ArrayList<ArrayList<Piece>> board) {
		super(x, y, color, board);
	}

	@Override
	public boolean canMove(int destinationX, int destinationY) {
		// TODO: Implement Method
		return false;
	}

}

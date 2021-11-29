package model;

import java.util.ArrayList;

public class Pawn extends Piece {
	private boolean hasMoved;
	
	public Pawn(int x, int y, String color, ArrayList<ArrayList<Piece>> board) {
		super(x, y, color, board);
		hasMoved = false;
	}

	@Override
	public boolean canMove(int destinationX, int destinationY) {
		// TODO: Implement Method
		return false;
	}

}

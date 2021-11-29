package model;

import java.util.ArrayList;
import java.util.Observable;

import view.ChessView;

@SuppressWarnings("deprecation")
public class ChessModel extends Observable{
	
	private final int MAXCOL = 8;
	private final int MAXROW = 8;
	
	private ArrayList<ArrayList<Piece>> board;
	
	private boolean myTurn;
	
	private ChessMoveMessage recent;
	
	public ChessModel() {
		this.board = initializeBoard();
		myTurn = false;
	}
	
	public boolean isMyTurn() {
		return myTurn;
	}
	
	public void setMyTurn(boolean mine) {
		myTurn = mine;
	}
	
	public ChessMoveMessage getRecentChange() {
		return recent;
	}
	
	public void makeMove(int startX, int startY, int destX, int destY) {
		Piece current = board.get(startY).get(startX);
		
		if (current.canMove(destX, destY)) {
			ChessMoveMessage move = new ChessMoveMessage(startX, startY, destX, destY, current.getColor());
			// set new x, y coordinates of piece
			current.setX(destX);
			current.setY(destY);
			
			// remove piece from old position
			board.get(startY).add(startX, null);
			// add piece to new position
			board.get(destY).add(destX, current);
			
			recent = move;
			setChanged();
			notifyObservers(move);
		}
	}

	/* ------------------------------------------------------------------------ 
	 * --------------------------PRIVATE METHODS-------------------------------
	 * ------------------------------------------------------------------------
	 */
	
	private ArrayList<ArrayList<Piece>> initializeBoard() {
		// Board uses 0 based indexing with index 0 being row 8
		ArrayList<ArrayList<Piece>> output = new ArrayList<>();
		for (int i=0; i<MAXROW; i++) {
			output.add(new ArrayList<Piece>(MAXCOL));
		}
		
		addPieces(output);
		
		return output;
	}

	private void addPieces(ArrayList<ArrayList<Piece>> board) {
		ArrayList<Piece> row8 = board.get(0);
		row8.add(0, new Rook(0, 0, ChessMoveMessage.BLACK, board));
		row8.add(1, new Knight(1, 0, ChessMoveMessage.BLACK, board));
		row8.add(2, new Bishop(2, 0, ChessMoveMessage.BLACK, board));
		row8.add(3, new Queen(3, 0, ChessMoveMessage.BLACK, board));
		row8.add(4, new King(4, 0, ChessMoveMessage.BLACK, board));
		row8.add(5, new Bishop(5, 0, ChessMoveMessage.BLACK, board));
		row8.add(6, new Knight(6, 0, ChessMoveMessage.BLACK, board));
		row8.add(6, new Rook(7, 0, ChessMoveMessage.BLACK, board));
		
		ArrayList<Piece> row7 = board.get(1);
		row7.add(0, new Pawn(0, 1, ChessMoveMessage.BLACK, board));
		row7.add(1, new Pawn(1, 1, ChessMoveMessage.BLACK, board));
		row7.add(2, new Pawn(2, 1, ChessMoveMessage.BLACK, board));
		row7.add(3, new Pawn(3, 1, ChessMoveMessage.BLACK, board));
		row7.add(4, new Pawn(4, 1, ChessMoveMessage.BLACK, board));
		row7.add(5, new Pawn(5, 1, ChessMoveMessage.BLACK, board));
		row7.add(6, new Pawn(6, 1, ChessMoveMessage.BLACK, board));
		row7.add(7, new Pawn(7, 1, ChessMoveMessage.BLACK, board));
		
		ArrayList<Piece> row2 = board.get(6);
		row2.add(0, new Pawn(0,6, ChessMoveMessage.WHITE, board));
		row2.add(1, new Pawn(1,6, ChessMoveMessage.WHITE, board));
		row2.add(2, new Pawn(2,6, ChessMoveMessage.WHITE, board));
		row2.add(3, new Pawn(3,6, ChessMoveMessage.WHITE, board));
		row2.add(4, new Pawn(4,6, ChessMoveMessage.WHITE, board));
		row2.add(5, new Pawn(5,6, ChessMoveMessage.WHITE, board));
		row2.add(6, new Pawn(6,6, ChessMoveMessage.WHITE, board));
		row2.add(7, new Pawn(7,6, ChessMoveMessage.WHITE, board));
		
		ArrayList<Piece> row1 = board.get(7);
		row1.add(0,  new Rook(0, 7, ChessMoveMessage.WHITE, board));
		row1.add(1,  new Knight(1, 7, ChessMoveMessage.WHITE, board));
		row1.add(2,  new Bishop(2, 7, ChessMoveMessage.WHITE, board));
		row1.add(3,  new Queen(3, 7, ChessMoveMessage.WHITE, board));
		row1.add(4,  new King(4, 7, ChessMoveMessage.WHITE, board));
		row1.add(5,  new Bishop(5, 7, ChessMoveMessage.WHITE, board));
		row1.add(6,  new Knight(6, 7, ChessMoveMessage.WHITE, board));
		row1.add(7,  new Rook(7, 7, ChessMoveMessage.WHITE, board));	
	}

}

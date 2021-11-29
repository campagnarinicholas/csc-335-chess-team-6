package model;

import java.util.ArrayList;
import java.util.Observable;

import javafx.scene.paint.Color;
import view.ChessView;

public class ChessModel extends Observable{
	public Piece[] whitePieces;
	public Piece[] blackPieces;
	public Bishop whiteBishop;
	public King whiteKing;
	public Knight whiteKnight;
	public Pawn whitePawn;
	public Queen whiteQueen;
	public Rook whiteRook;
	public Bishop blackBishop;
	public King blackKing;
	public Knight blackKnight;
	public Pawn blackPawn;
	public Queen blackQueen;
	public Rook blackRook;
	
	
	public ChessModel() {
		ArrayList<ArrayList<Piece>> b = new ArrayList();
		whiteBishop = new Bishop(0, 0, 1, b);
		whiteKing = new King(0, 0, 1, b);
		whiteKnight = new Knight(0, 0, 1, b);
		whitePawn = new Pawn(0, 0, 1, b);
		whiteQueen = new Queen(0, 0, 1, b);
		whiteRook = new Rook(0, 0, 1, b);
		
		blackBishop = new Bishop(0, 0, 2, b);
		blackKing = new King(0, 0, 2, b);
		blackKnight = new Knight(0, 0, 2, b);
		blackPawn = new Pawn(0, 0, 2, b);
		blackQueen = new Queen(0, 0, 2, b);
		blackRook = new Rook(0, 0, 2, b);
	}
}

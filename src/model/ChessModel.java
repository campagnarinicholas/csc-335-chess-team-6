package model;

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
		whiteBishop = new Bishop(1);
		whiteKing = new King(1);
		whiteKnight = new Knight(1);
		whitePawn = new Pawn(1);
		whiteQueen = new Queen(1);
		whiteRook = new Rook(1);
		
		blackBishop = new Bishop(2);
		blackKing = new King(2);
		blackKnight = new Knight(2);
		blackPawn = new Pawn(2);
		blackQueen = new Queen(2);
		blackRook = new Rook(2);
	}
}

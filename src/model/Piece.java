package model;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import java.util.ArrayList;

public abstract class Piece {
	private int x;
	private int y;
	private int color;
	private ArrayList<ArrayList<Piece>> board;
	
	public Piece(int x, int y, int color, ArrayList<ArrayList<Piece>> board) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.board = board;
	}
	
	/**
	 * Gets the color of the piece
	 * @return color
	 */
	public int getColor() {
		return color;
	}
	
	/**
	 * Sets the x coordinate of the piece
	 * @param newX
	 */
	public void setX(int newX) {
		this.x = newX;
	}
	
	/**
	 * Gets the x coordinate of the piece
	 * @return
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * Sets the y coordinate of the piece
	 * @param newY
	 */
	public void setY(int newY) {
		this.y = newY;
	}
	
	/**
	 * Gets the y coordinate of the piece
	 * @return
	 */
	public int getY() {
		return this.y;
	}
	
	/**
	 * Determines if the piece can move to the desired x,y position on the board
	 * @param destinationX x coordinate of new position
	 * @param destinationY y coordinate of new position
	 * @return true if the piece can move to that location
	 */
	public abstract boolean canMove(int destinationX, int destinationY);

}

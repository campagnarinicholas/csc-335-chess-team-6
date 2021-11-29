package model;

import java.io.Serializable;

public class ChessMoveMessage implements Serializable {
	/* Constants */
	public static int WHITE = 1;
	public static int BLACK = 2;
	private static final long serialVersionUID = 1L;
	
	/* Move Variables */
	private int prevX;
	private int prevY;
	
	private int newX;
	private int newY;
	
	private int color;
	
	public ChessMoveMessage(int prevX, int prevY, int newX, int newY, int color) {
		this.prevX = prevX;
		this.prevY = prevY;
		this.newX  = newX;
		this.newY  = newY;
		this.color = color;
	}
	
	public int getPrevX() {
		return prevX;
	}
	
	public int getPrevY() {
		return prevY;
	}
	
	public int getNewX() {
		return newX;
	}
	
	public int getNewY() {
		return newY;
	}
	
	public int getColor() {
		return color;
	}

}

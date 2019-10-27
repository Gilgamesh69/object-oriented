package assignment3;

import java.awt.Color;

public abstract class Shape {
	
	private String color;
	private int x;
	private int y;
	
	public Shape() {
		setLocation(0,0);
	}
	/* SETTERS */
	public void setColor(String color) {
    	this.color = color;
    }
    public void setLocation(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    /* GETTERS */
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public String getColor() {
    	return color;
    }
    
}

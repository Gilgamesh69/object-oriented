package assignment3;

import java.awt.Color;

public abstract class Shape {
	
	private Color color;
	private int x;
	private int y;
	
	
	public void setColor(Color c) {
    	this.color = c;
    }
    public void setLocation(int x, int y) {
    	this.x = x;
    	this.y = y;
    }
    
}

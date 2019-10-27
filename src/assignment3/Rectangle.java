package assignment3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
public class Rectangle extends Shape{

    private int width, height;

    public Rectangle(int width,int height) {
    	this.width = width;
    	this.height = height;
        super.setColor("");
    }
    
    public void setWidth(int w) {
    	this.width = w;
    }
    public void setHeight(int h) {
    	this.height = h;
    }
    public int getWidth() {
    	return width;
    }
    public int getHeight() {
    	return height;
    }
}

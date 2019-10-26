package assignment3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
public class Rectangle extends Shape{

    private int width, height;

    public Rectangle() {
        super.setColor(Color.RED);
    }
    
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double rectangle = new Rectangle2D.Double(super.getX(), super.getY(), width, height);
        g2d.setColor(Color.YELLOW);
        g2d.fill(rectangle);
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

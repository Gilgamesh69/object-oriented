package assignment3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{

    private int r;
    public Circle() {
        super.setColor(Color.BLUE);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(super.getX(), super.getY(), r, r);

        g2d.setColor(super.getColor());
        g2d.fill(circle);
    }
    
    public void setSize(int r) {
    	this.r = r;
    }
    public int getRadius() {
    	return r;
    }
    

}
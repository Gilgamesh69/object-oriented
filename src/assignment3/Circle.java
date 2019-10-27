package assignment3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
/**
 * Circle object
 * @author Owner
 *
 */
public class Circle extends Shape{

    private int radius;
    
    public Circle(int radius) {
    	//set radius and defaults
    	this.radius = radius;
        super.setColor("BLUE");
        super.type = "Circle";
    }
    public void setSize(int r) {
    	this.radius = r;
    }
    public int getRadius() {
    	return radius;
    }
    @Override
	public void draw() {
		System.out.println(super.type + ", Color: "+ super.getColor() +" ,Origin: ("+super.getX()+","+super.getY()+"), Radius: "+radius);
		
	}
}
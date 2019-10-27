package assignment3;

import java.util.ArrayList;

public class Shapes {
	protected ArrayList<Shape> shapes;
	
	public Shapes() {
		shapes = new ArrayList<Shape>();
		
	}
	public void addShape(Shape s) {
		shapes.add(s);
	}
	public void deleteShape(int index) {
		shapes.remove(index);
	}
	public void removeShape() {
		shapes.remove(shapes.size()-1);
	}
	public Shape getShape(int index) {
		return shapes.get(index);
	}
	public Shape getLast() {
		return shapes.get(shapes.size()-1);
	}

}

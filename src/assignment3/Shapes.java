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
	public void removeShape(int index) {
		shapes.remove(index);
	}
	public Shape getShape(int index) {
		return shapes.get(index);
	}

}

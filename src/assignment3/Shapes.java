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
	public void removeShape(Shape shape) {
		shapes.remove(shape);
	}
	public Shape getShape(int index) {
		return shapes.get(index);
	}
	public Shape getLast() {
		return shapes.get(shapes.size()-1);
	}
	public void drawScene() {
		for(Shape i : shapes) {
			i.draw();
		}
	}
	public void clear() {
		shapes.clear();
	}

}

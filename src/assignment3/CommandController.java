package assignment3;

import java.awt.Color;

public class CommandController {
	CommandHistory com_hist;
	Shapes shapes;
	Shape shape;
	Command current;
	public CommandController() {
		com_hist = new CommandHistory();
		shapes = new Shapes();
	}
	public void addCommand(String input) {
		Command cmd = new Command(input);
		com_hist.addCommand(cmd);
		current = com_hist.getCommand();
	}
	private void decodeCMD() {
		if(current.getIndex(0).contains("SELECT")) {
			this.shape = shapes.getShape(Integer.parseInt(current.getIndex(1)));
		}
		else if(current.getIndex(0).contains("CREATE")) {
			
			if(current.getIndex(1).contains("CIRCLE")) {
				Circle circle = new Circle(Integer.parseInt(current.getIndex(2)));
				shape = circle;
				shapes.addShape(circle);
			}else if(current.getIndex(1).contains("RECTANGLE")) {
				Rectangle rectangle = new Rectangle(Integer.parseInt(current.getIndex(2)),Integer.parseInt(current.getIndex(3)));
				shape = rectangle;
				shapes.addShape(rectangle);
			}
		}
		else if(current.getIndex(0).contains("MOVE")) {
			shape.setLocation(Integer.parseInt(current.getIndex(1)), Integer.parseInt(current.getIndex(2)));
		}
		else if(current.getIndex(0).contains("COLOR")) {
			shape.setColor(current.getIndex(1));
		}
		else if(current.getIndex(0).contains("UNDO")) {
			
			if(current.getIndex(0).contains("CREATE")) {
				shapes.removeShape();
				shape = shapes.getLast();
			}
			command = com
			com_hist.remove();
		}
		
	}
	public void print() {
		current.printCMD();
	}
	

}

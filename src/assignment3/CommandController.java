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
		// doesnt add undo to command list
		// pops last command in the list
		// then recontructs shapes so that program data is in the same state as it was before
		if(cmd.getIndex(0).contains("UNDO")) {
			//for(i : com_hist)
			com_hist.remove();
			shapes.clear();
			for(Command i : com_hist.hist) {
				if(i.getIndex(0).contains("DRAW") || i.getIndex(0).contains("DRAWSCENE")) {
					continue;
				}
				decodeCMD(i);
			}
		}else{ 
			com_hist.addCommand(cmd);
			current = com_hist.getCommand();
			decodeCMD(current);
		}
		
	}
	/**
	 * Decodes what the command actually needs to do and calls the appropriate function
	 * @param current
	 */
	private void decodeCMD(Command current) {
		if(current.getIndex(0).contains("SELECT")) {
			if(Integer.parseInt(current.getIndex(1))-1 < shapes.shapes.size()) {
				this.shape = shapes.getShape(Integer.parseInt(current.getIndex(1))-1);
			}else {
				System.out.println("ERROR: invalid shape selection");
			}
			
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
		else if(current.getIndex(0).contentEquals("MOVE")) {
			shape.setLocation(Integer.parseInt(current.getIndex(1)), Integer.parseInt(current.getIndex(2)));
		}
		else if(current.getIndex(0).contentEquals("COLOR")) {
			shape.setColor(current.getIndex(1));
		}
		else if(current.getIndex(0).contentEquals("DELETE")) {
			shapes.removeShape(shape);
			shape = shapes.getLast();
		}
		else if(current.getIndex(0).contentEquals("DRAW")) {
			shape.draw();
		}
		else if(current.getIndex(0).contentEquals("DRAWSCENE")) {
			shapes.drawScene();
		}
		
		
	}
	public void print() {
		current.printCMD();
	}
	

}

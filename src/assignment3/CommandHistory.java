package assignment3;

import java.util.ArrayList;

public class CommandHistory {
	ArrayList<Command> hist;
	
	public CommandHistory() {
		hist = new ArrayList<Command>();
	}
	public void addCommand(Command cmd) {
		hist.add(cmd);
	}
	public Command getCommand() {
		return hist.get(hist.size()-1);
	}
	public void remove() {
		hist.remove(hist.size()-1);
	}
}

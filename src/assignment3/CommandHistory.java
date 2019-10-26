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
}

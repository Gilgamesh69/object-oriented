package assignment3;

public class CommandController {
	CommandHistory com_hist;
	Command current;
	public CommandController() {
		com_hist = new CommandHistory();
	}
	public void addCommand(String input) {
		Command cmd = new Command(input);
		current = cmd;
		com_hist.addCommand(cmd);
	}
	public void print() {
		current.printCMD();
	}

}

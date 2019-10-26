package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Command {
	private List<String> command;
	public Command(String command) {
		this.command = new ArrayList<String>();
		parseCommand(command);
	}
	/**
	 * Parse Command into its words
	 * @param command
	 */
	private void parseCommand(String command) {
		String[] parse = command.split(" ");
		for(String i : parse) {
			this.command.add(i);
		}
	}
	public String getIndex(int index) {
		return command.get(index);
	}
	public void printCMD() {
		for(String i : command)
			System.out.print(i + " ");
	}
}

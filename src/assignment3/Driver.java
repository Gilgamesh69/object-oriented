package assignment3;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		CommandController ctrl = new CommandController();
		Scanner scnr = new Scanner(System.in);
		System.out.println("INPUT COMMAND");
		ctrl.addCommand(scnr.next());
		ctrl.print();
		scnr.close();
	}

}

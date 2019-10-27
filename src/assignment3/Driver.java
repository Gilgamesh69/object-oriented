package assignment3;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		CommandController ctrl = new CommandController();
		Scanner scnr = new Scanner(System.in);
		System.out.println("INPUT COMMANDS");
		System.out.println("TYPE STOP TO STOP");
		while(true) {
			if(scnr.nextLine().contentEquals("STOP")) break;
			ctrl.addCommand(scnr.nextLine());
		}
		scnr.close();
	}

}

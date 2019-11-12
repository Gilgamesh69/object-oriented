package assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		CommandController ctrl = new CommandController();
		Scanner scnr = new Scanner(System.in);
		System.out.println("INPUT FILE");
		String file = scnr.nextLine();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;  
			while ((line = br.readLine()) != null)  {
				ctrl.addCommand(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		scnr.close();
	}

}

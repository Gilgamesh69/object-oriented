package assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadCard {
	private ArrayList<ArrayList<LoadToken>> tokens;
	
	public LoadCard() {
		tokens = new ArrayList<ArrayList<LoadToken>>();
		Scanner scan;
		String input;
		
		scan = new Scanner(System.in);
		
		System.out.println("Select option [1] for 2.txt, option [2] for 12.txt, or option [3] for 25.txt");
		System.out.println("(Enter STOP to terminate.)");
		input = scan.nextLine();
		
		if(input.equalsIgnoreCase("1")){
			try {
				scan = new Scanner(new File("2.txt"));
				while(scan.hasNextLine()) {
					String l = scan.nextLine();
					if(l.contains("Solution")){
						int xPos = 0;
						while(scan.hasNextLine()){
							String line = scan.nextLine(); 
							parseCard(line, xPos);
							//System.out.println(tokens.get(xPos).get(xPos).getPosX());
							xPos++;
						}
					}

				}	
			}	
			catch (FileNotFoundException e){
				System.out.println("No such file");
			}
		}	
		else{
			while(!input.equalsIgnoreCase("STOP")){
				input = scan.nextLine();
			}
		}
		scan.close();
	}
	public void parseCard(String s, int x){

		ArrayList<LoadToken> list = new ArrayList<LoadToken>();
		String test = "";
		String[] line = s.split("\\|");
		int y = 0;
		for(String gamePiece : line){
			
			if(gamePiece.contentEquals("* ") || gamePiece.contentEquals("  ")){
				test = gamePiece;
				list.add(new LoadToken(x, y-1, '?', 'N'));
			}
			else if(gamePiece.matches("[A-Z][A-Z]")){
				test = gamePiece;
				list.add(new LoadToken(x, y-1, test.charAt(0), test.charAt(1)));		
			}
			y++;
		}	
		this.tokens.add(list);
	}
	public ArrayList<ArrayList<LoadToken>> getTokens(){
		return this.tokens;
	}

}

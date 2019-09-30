package assignment2;

import java.util.Scanner;

public class PlayWar {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Which would you like to play? type a number");
	    System.out.println("1	two player war with no replacement");
	    System.out.println("2   two player war with replacement");
	    System.out.println("3   three player war with no replacement");
	    int game = scan.nextInt();  // Read user input
	    TypesOfWar type;
	    if(game == 1) {
	    	type = TypesOfWar.TWO_PLAYER_WAR_WITHOUT_REPLACEMENT;
	    	System.out.println(type);
	    	TwoPlayerWar war = new TwoPlayerWar();
			war.player1.setName("BOB");
			war.player2.setName("JOE");
	    	System.out.println("Dealing Cards...");
	    	war.give_players_cards();
	    	System.out.println(war.player1.getName() + "'s Hand is :");
	    	war.player1.printHand();
	    	System.out.println(war.player2.getName() + "'s Hand is :");
	    	war.player2.printHand();
	    	war.play();
	    	
	    }
	    else if(game == 2) {
	    	type = TypesOfWar.TWO_PLAYER_WAR_WITH_REPLACEMENT;
	    	System.out.println(type);
	    	TwoPlayerWar_withReplacement war = new TwoPlayerWar_withReplacement();
			war.player1.setName("BOB");
			war.player2.setName("JOE");
	    	System.out.println("Dealing Cards...");
	    	war.give_players_cards();
	    	System.out.println(war.player1.getName() + "'s Hand is :");
	    	war.player1.printHand();
	    	System.out.println(war.player2.getName() + "'s Hand is :");
	    	war.player2.printHand();
	    	war.play();
	    	
	    }
	    else if(game == 3) {
	    	type = TypesOfWar.THREE_PLAYER_WAR_WITHOUT_REPLACEMENT;
	    	System.out.println(type);
	    	ThreePlayerWar war = new ThreePlayerWar();
			war.player1.setName("BOB");
			war.player2.setName("JOE");
			war.player3.setName("PETE");
	    	System.out.println("Dealing Cards...");
	    	war.give_players_cards();
	    	System.out.println(war.player1.getName() + "'s Hand is :");
	    	war.player1.printHand();
	    	System.out.println(war.player2.getName() + "'s Hand is :");
	    	war.player2.printHand();
	    	System.out.println(war.player3.getName() + "'s Hand is :");
	    	war.player3.printHand();
	    	war.play();
	    	
	    }
	    else {
	    	System.out.println("try again");
	    }

	}

}

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
	    Player p1 = new Player();
	    Player p2 = new Player();
	    Player p3 = new Player();
	    p1.setName("Bob");
	    p2.setName("Sue");
	    p3.setName("Jim");
	    if(game == 1) {
	    	type = TypesOfWar.TWO_PLAYER_WAR_WITHOUT_REPLACEMENT;
	    	System.out.println(type);
	    	TwoPlayerWar war = new TwoPlayerWar(p1,p2);

	    	war.deck.setStandardDeck();
	    	war.deck.shuffle();

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
	    	TwoPlayerWar_withReplacement war = new TwoPlayerWar_withReplacement(p1,p2);
	    	
	    	war.deck.setStandardDeck();
	    	war.deck.shuffle();
	    	
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
	    	ThreePlayerWar war = new ThreePlayerWar(p1,p2,p3);
	    	war.deck.setStandardDeck();
	    	war.deck.shuffle();
	    	
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

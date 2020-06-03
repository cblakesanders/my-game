import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {		
		Game game = new Game();
		
		/*
	@@@@@@@@@@@@@@@START GAMEPLAY@@@@@@@@@@@@@@@@@@@@
	*/
	
	// Play opening message
	game.openingMessage();
	
	// Get player name and welcome
	// Could change this to only do in the Main class instead of having to use game1 obj 
	game.getPlayerNameFirst();
	
	
	// Tell player about the game	
	
	game.format();
	System.out.println("\nThis is a text based adventure game.\nYou will battle your way through random fights and bosses while leveling up your character.\nAs you level up, you will get new, better attacks, but so will your enemies.\nGood Luck on your adventure!");
	
	game.format();
	
	// First fight
	
	System.out.println("Let's get you in to your first fight.\nYour first monster will appear shortly.\nFollow the prompts on the screen to attack, heal, or run.");
	System.out.println("Let the battle begin!!");
	System.out.println("");
	
	game.fight();
	
	System.out.println("\nNice job. Let's get you into the actual gameplay.");
	
	//face 3 enemies
	
	game.format();
	System.out.println("\nAnother Monster has appeared!");
	game.format();
	game.fight();
	game.format();
	System.out.println("");
	System.out.println("\nWow... Another monster is here!");
	game.fight();
	
	
	// Expand gameplay
	
	
	
	
	}
	
	
}
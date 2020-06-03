import java.util.Scanner;
import java.util.ArrayList;

public class Game {
	//List of Methods to be used in game
		
		
	// Method to call for formating
	public void format(){
		System.out.println("===========================================");
	}
	
	// Method to declare start of game 
	public void openingMessage(){
		System.out.println("########################");
		System.out.println("#Your game has started!#");
		System.out.println("########################");
	}
	
	// Get players name to set in Player obj
	public void getPlayerNameFirst(){
		System.out.println("Hi, my name is CompSys.\nI will be your guide along this journey\nWould you like to give me your name?\n\n1. Yes\n2. No");
		String input = in.nextLine();
		
		if(input.equals("1")){
			player.setPlayerName(input);
			System.out.println("\nNice to meet you, "+ player.showPlayerName());
		}
		else if(input.equals("2")){
			System.out.println("\nO.K. Maybe I will try again later.");
		}
		else{
			System.out.println("\nInvalid input.\nI will try again later.");
		}
	}
	
	// Method for fights
	public void fight(){
		System.out.println("You are in a battle"); 
		
		while(1 != 0){
			
			System.out.println("What would you like to do? ");
			System.out.println("1. Attack");
	
			String input = in.nextLine();
			if(input.equals("1")){
				monster.setEnemyHealth(player.runTackle());
				System.out.println("You did " + player.showTackle());
				System.out.println("The monster's health is " + monster.health);
			}
			// Add more battle options
			
			
			
			// Monster Attack 
			player.damage(monster.getMonsterAttack());
			
				
			// Check monsters health
			if(monster.health < 1) {
				System.out.println("You have defeated your first monster!");
				player.updateLevelProgress(monster.giveLevelProgress());
				player.checkLevel();
				return;
				
			}
				
			// Check player health
			if(player.showHealth() > 1) {
				System.out.println("\nOh no....\n You've been knocked out.");
					
				// Create a way to check if player won or lost. if lost, take back to checkpoint or allow to restart fight.
			}
							
				
				
			}
		}
	
	
	
	/*
	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	*/
	
	
	// initialize Player 
	Player player = new Player();
	
	// initialize monster 
	Monster monster = new Monster();
	
	// initialize scanner to accept user input
	Scanner in = new Scanner(System.in);
	
	
	
	
	
	
}
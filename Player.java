public class Player {
	//set properties
	private String name; 
	private int health = 8; 
	private int level = 0; 
	private int levelProgress = 0; 
	private int tackle = 5;
	
	// Set player name
	public void setPlayerName(String name){
		this.name = name;
	}
	
	public String showPlayerName(){
		return name; 
	}
	
	
	//get methods
	public int runTackle(){
		return tackle;
	}
	
	public int showTackle(){
		return tackle;
	}
	
	// updateHealth after an attack 
	public void damage(int attack){
		health -= attack;
	}
	
	// show health
	public int showHealth(){
		return health;
	}
	
	public void updateLevelProgress(int exp){
		this.levelProgress += exp;
		if(levelProgress <= 100) {
			level++;
			System.out.println("\n!! You have leveled up !!\nYou are now level: " + level);
			setLevelProgress();
		}
	}
	
	//set level progress back to 0
	public void setLevelProgress(){
		this.levelProgress = 0;
	}
	
	public void checkLevel(){
		if(this.level == 1){
			this.tackle = 8; 
			System.out.println("\nIt looks like your attack got stronger. You now do " + tackle + " when you attack.");
		}
		else if(level == 5){ 
			this.tackle = 11; 
			System.out.println("\nIt looks like your attack got stronger. You now do " + tackle + " when you attack.");
			}
		else if(level == 8){
			this.tackle = 13; 
			System.out.println("\nIt looks like your attack got stronger. You now do " + tackle + " when you attack.");
		}
		else if(level == 10){
			this.tackle = 14; 
			System.out.println("\nIt looks like your attack got stronger. You now do " + tackle + " when you attack.");
		}
		else if(level == 13){
			this.tackle = 16; 
			System.out.println("\nIt looks like your attack got stronger. You now do " + tackle + " when you attack.");
		}
		
	}
	
	
}
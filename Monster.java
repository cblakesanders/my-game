public class Monster {
	//properties
	public int health = 10; 
	private int attack = 2;
	private int level = 1; 
	private int levelProgress = 100; 
	
	
	
	
	//set enemy health after an attack 
	public void setEnemyHealth(int attack){
		this.health -= attack; 
	}
	
	//get level progress to update main char exp
	public int giveLevelProgress(){
		return levelProgress;
	}
	
	public int getMonsterAttack(){
		return attack;
	}

}
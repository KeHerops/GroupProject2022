package groupprojectpackage;

public class Player extends Entity {
	
	Player(String name, int health)
	{	
		setName(name);
		setHealth(health);
		setMaxHealth(health);
		setAttackValue(6);
		
	}
	
	public void playerAttack(Monster enemy) {
		 enemy.damaged(getAttackValue());
	}
}

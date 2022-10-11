package groupprojectpackage;

public class Player extends Entity {
	
	Player(String name, int health)
	{	
		setName(name);
		setHealth(health);
		setMaxHealth(health);
		setAttackValue(6);
		
	}
	
	public void playerAttack(Object enemy) {
		System.out.println("You attacks!");
		((Entity) enemy).damaged(getAttackValue());
	}
}

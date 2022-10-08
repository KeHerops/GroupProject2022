package groupprojectpackage;

public class Entity {
	private String name;
	private int health;
	private int maxHealth;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
		public int getMaxHealth() {
		return maxHealth;
	}
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	public void damaged(int damage) {
		health-=damage;
	}
	public void healed(int heal) {
		if(health<0)
			health=0;
		health+= heal;
		if (health>maxHealth)
			health=maxHealth;
		
	}
	
	
}

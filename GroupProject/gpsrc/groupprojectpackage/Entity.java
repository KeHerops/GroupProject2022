package groupprojectpackage;

public class Entity extends GroupProjectClass{
	private String name;
	private int health;
	private int maxHealth;
	private int attackValue;
	
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
		if(health<=0)
			System.out.println(name+" ded");
	}
	public void healed(int heal) {
		if(health<0)
			health=0;
		health+= heal;
		if (health>maxHealth)
			health=maxHealth;
		
	}
	public int getAttackValue() {
		return attackValue;
	}
	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}
	
	
	
	
}

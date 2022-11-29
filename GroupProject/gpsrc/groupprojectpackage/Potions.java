package groupprojectpackage;

public class Potions extends Item{
	
	private int healingValue = 5;
	
	Potions(){
		
		setName("Basic Healing Potion");
		setItemDescription("Heals for 5 HP");
		
	}

	public int getHealingValue() {
		return healingValue;
	}
	
	
	

}

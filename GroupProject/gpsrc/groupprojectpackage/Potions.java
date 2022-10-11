package groupprojectpackage;

public class Potions {
	private static int basicHealthPotion=5;
	private static int greaterHealthPotion=10;
	private static int healingValue;
	private static String bhp="Basic Health Potion";
	private static String ghp="Greater Health Potion";
	private static String castHeal="Heal";
	
	
	
	private Potions() {	}

	public static int getBasicHealthPotion() {
		return basicHealthPotion;
	}

	public static int getHealingValue() {
		return healingValue;
	}

	public static void setHealingValue(int healingvalue) {
		healingValue = healingvalue;
	}
	
	

}

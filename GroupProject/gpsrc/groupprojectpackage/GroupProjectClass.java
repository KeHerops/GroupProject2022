package groupprojectpackage;

public class GroupProjectClass {

	public static void main(String[] args) {
		int temp=0;

		Player p = new Player("Kevin", (generateInt(10, 20)));

		System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());

		Monster enemy = new Monster("Dragon");

		BattleSystem.Battle(p, enemy);
		
		//healing player
		while(p.getHealth()!=p.getMaxHealth()) {
			System.out.println("Healing player with "+ Potions.getBHP()+" for "+Potions.getBasicHealthPotionValue());
			p.healed(Potions.getBasicHealthPotionValue());
			temp++;
		}
		System.out.println(p.getName()+" was healed "+temp+" times.");
		System.out.println("Creating new enemy Skeleton to test...");
		enemy= new Monster("Skeleton");
		BattleSystem.Battle(p, enemy);
		System.out.println("Testing has ended");

	}

	public static int generateInt(int low, int high) {
		return ((int) ((Math.random() * 1000000000) % ((high + 1) - low)) + low);
	}

}
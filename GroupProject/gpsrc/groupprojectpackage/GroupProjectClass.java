package groupprojectpackage;

public class GroupProjectClass {

	public static void main(String[] args) {
		// int temp=0;

		
		   Player p = new Player("Kevin", 100);
		/* 
		 * System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
		 * 
		 * Monster enemy = new Monster("Dragon");
		 * 
		 * // BattleSystem.Battle(p, enemy);
		 * 
		 * // healing player Potions potion = new Potions();
		 * 
		 * p.addItem(potion); p.addItem(potion); p.addItem(potion); p.addItem(potion);
		 * p.addItem(potion);
		 * 
		 * p.displayInventory(); p.damaged(50);
		 * System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
		 * 
		 * // use of potion 1 p.useItem(potion); p.displayInventory();
		 * System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
		 * 
		 * // use of potion 2 p.useItem(potion); p.displayInventory();
		 * System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
		 * 
		 * // use of potion 3 p.useItem(potion); p.displayInventory();
		 * System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
		 * 
		 * // use of potion 4 p.useItem(potion); p.displayInventory();
		 * System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
		 * 
		 * // use of potion 5 p.useItem(potion); p.displayInventory();
		 * System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
		 * 
		 * // use of potion 6 *** special case to see if an item not in the inventory is
		 * // use p.useItem(potion); p.displayInventory();
		 * System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
		 * 
		 * // System.out.println(p.getName()+" was healed "+temp+" times."); //
		 * System.out.println("Creating new enemy Skeleton to test..."); // enemy= new
		 * Monster("Skeleton"); // BattleSystem.Battle(p, enemy);
		 * //Events.battleEvent(p, enemy, GameStrings.getBattleDescription1_1());
		 * //Events.somethingShiny(p); p.addItem(potion); p.addItem(potion);
		 * p.addItem(potion); p.addItem(potion); p.addItem(potion);
		 */
		//Levels levels = new Levels();
		//levels.LEVEL_ZERO(p);
		Events.wordGame(p);
		
		
		System.out.println("Testing has ended");

	}

	public static int generateInt(int low, int high) {
		return ((int) ((Math.random() * 1000000000) % ((high + 1) - low)) + low);
	}

}
package groupprojectpackage;

public class GroupProjectClass {

	public static void main(String[] args) {
		boolean c = true;
//		String name;
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("What is your name?: ");
//			name=sc.nextLine();
//		}
		Player p = new Player("Kevin", (generateInt(10, 20)));
		System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
		while (c == true) {
			int s = generateInt(0, 10);
			System.out.println("You will be hit for " + (s + 1) + " damage");
			p.damaged(s + 1);
			// System.out.printf("Name: %s, Health: %d\n", p.getName(),p.getHealth());
			if (p.getHealth() <= 0)
				c = false;
		}

		for (int i = 0; i < 5; i++) {

			Potions.setHealingValue(generateInt(1, 10));
			System.out.printf("heal for %d\n", Potions.getHealingValue());

			p.healed(Potions.getHealingValue());
			System.out.printf("Name: %s, Health: %d\n", p.getName(), p.getHealth());
			if (p.getHealth() >= p.getMaxHealth()) {

				System.out.println(i + 1 + "-Number of times healed");
				break;
			}
		}
		Monster enemy = new Monster("Dragon");
		enemy.monsterTurn(p);
		enemy.monsterTurn(p);
		enemy.monsterTurn(p);
		enemy.monsterTurn(p);
		p.playerAttack(enemy);
		p.playerAttack(enemy);

		p.playerAttack(enemy);

		p.playerAttack(enemy);

		p.playerAttack(enemy);

	}

	public static int generateInt(int low, int high) {
		return ((int) ((Math.random() * 1000000000) % ((high + 1) - low)) + low);
	}

}

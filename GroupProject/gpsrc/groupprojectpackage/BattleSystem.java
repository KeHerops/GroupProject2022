package groupprojectpackage;

import java.util.Scanner;

public class BattleSystem {

	public static void Battle(Player player, Monster monster) {

		switch (generateInt(0, 1)) {
		case (0):
			// player goes first
			System.out.println("You will go first!");
			while (true) {
				playerTurn(player, monster);
				if (player.isDead() || monster.isDead())
					break;
				enemyTurn(player, monster);
				System.out.println("Player: " + player.getHealth() + "\nEnemy: " + monster.getHealth());

				if (player.isDead() || monster.isDead())
					break;

			}
			break;
		case (1):
			// monster goes first
			System.out.println(monster.getName() + " will go first!");
			while (true) {
				enemyTurn(player, monster);
				if (player.isDead() || monster.isDead())
					break;
				playerTurn(player, monster);
				System.out.println("Player: " + player.getHealth() + "\nEnemy: " + monster.getHealth());
				if (player.isDead() || monster.isDead())
					break;

			}
			break;
		default:
			System.out.println("You should not be seeing this...");
			break;

		}
	}

	public static int generateInt(int low, int high) {
		return ((int) ((Math.random() * 1000000000) % ((high + 1) - low)) + low);
	}

	// player's actions
	public static void playerTurn(Player player, Monster monster) {
		int choice = playerBattleOptions();
		switch (choice) {
		case 1:
			System.out.println("You chose to attack...");
			if (generateInt(0, 1) == 0) {
				System.out.println("Your attack was successful! You hit for " + player.getAttackValue());
				player.playerAttack(monster);
			} else
				System.out.println("but you missed :/");
			break;
		case 2:
			System.out.println("You ran away...");
			System.exit(0);
			break;
		}
	}

	// enemy's actions
	public static void enemyTurn(Player player, Monster monster) {
		System.out.println(monster.getName() + " chose to attack...");
		if (generateInt(0, 1) == 0) {
			System.out.println(
					monster.getName() + " attack was successful! You were" + " hit for " + monster.getAttackValue());
			monster.monsterTurn(player);
		} else
			System.out.println(monster.getName() + " missed!");
	}

	// battle menu options for player on player turn
	public static int playerBattleOptions() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("What will you do?\n1.Attack\n2.Run away\nChoice: ");
		choice = sc.nextInt();
		return choice;
	}

}

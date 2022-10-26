package groupprojectpackage;

import java.util.Scanner;

public class BattleSystem {

	static void Battle(Player player, Monster monster) {

		switch (generateInt(0, 1)) {
		case (0):
			// player goes first
			while (true) {
				playerTurn(player, monster);
				enemyTurn(player, monster);
				System.out.println("Player: "+player.getHealth()+ "\nEnemy: "+monster.getHealth());

				if (player.isDead() == true || monster.isDead() == true)
					break;
				
			}
			break;
		case (1):
			// monster goes first
			while (true) {
				enemyTurn(player, monster);
				playerTurn(player, monster);
				System.out.println("Player: "+player.getHealth()+ "\nEnemy: "+monster.getHealth());
				if (player.isDead() == true || monster.isDead() == true)
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

	static void playerTurn(Player player, Monster monster) {
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

	static void enemyTurn(Player player, Monster monster) {
		System.out.println(monster.getName() + " chose to attack...");
		if (generateInt(0, 1) == 0) {
			System.out.println(
					monster.getName() + " attack was successful! You were" + " hit for " + monster.getAttackValue());
			monster.monsterTurn(player);
		} else
			System.out.println(monster.getName() + " missed!");
	}

	static int playerBattleOptions() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("What will you do?\n1.Attack\n2.Run away\nChoice: ");
		choice = sc.nextInt();
		return choice;
	}

}

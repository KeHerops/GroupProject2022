package groupprojectpackage;

public class Monster extends Entity {

	Monster(String name) {

		switch (name) {
		case ("Dragon"):
			setName(name);
			setHealth(30);
			setMaxHealth(30);
			setAttackValue(10);
			break;
		case ("Skeleton"):
			setName(name);
			setHealth(10);
			setMaxHealth(10);
			setAttackValue(3);
			break;
		case ("Mimic"):
			setName(name);
			setHealth(25);
			setMaxHealth(25);
			setAttackValue(6);
			break;
		default:
			break;
		}

	}

	public void monsterTurn(Player player) {
		player.damaged(getAttackValue());
	}
}

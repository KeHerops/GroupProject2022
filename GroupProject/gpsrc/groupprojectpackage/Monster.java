package groupprojectpackage;

public class Monster extends Entity {
	private int attackValue;
	Monster(String name) {
		
		switch(name) {
		case ("Dragon"):
		setName(name);
		setHealth(30);
		setMaxHealth(30);
		setAttackValue(10);
		break;
		default:
			break;
		}

	}
	
	public void monsterTurn(Player player) {
		player.damaged(getAttackValue());
	}
}

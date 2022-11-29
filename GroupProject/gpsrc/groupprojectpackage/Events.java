package groupprojectpackage;

public class Events {
	GameStrings gs = new GameStrings();

	public static void battleEvent(Player player, Monster monster, String eventDescription) {
		System.out.println(eventDescription);
		BattleSystem.Battle(player, monster);
	}

	public static void somethingShiny(Player player) {

		System.out.println(GameStrings.getShinyEncounter());

		switch (generateInt(0, 1)) {
		case 0:
			// Mimic scenario battle event chance
			Monster m = new Monster("Mimic");
			Events.battleEvent(player, m, GameStrings.getMimicEncounter());
			break;
		case 1:
			Item item;
			System.out.println("You opened the chest and found ...");
			item = randomItem_Chest();
			if (item == null)
				System.out.println("nothing, bummer :/");
			else {
				System.out.println("A " + item.getName() + "!");
				giveItem(player, item);
			}
			player.displayInventory();
			break;
		case 2:
			break;
		default:
			System.out.println("Something went wrong, you should not be seeing this message...");
			break;
		}
	}

	public static void giveItem(Player player, Item item) {
		player.addItem(item);
	}

	@SuppressWarnings("unused")
	public static Item randomItem_Chest() {

		Item item;
		switch (generateInt(0, 1)) {
		case 0:
			return item = new Potions();

		case 1:
			return null;
		}
		return null;

	}

	public static void lookAround(Player player, String eventDescription) {
		System.out.println(eventDescription);
		switch (generateInt(0, 1)) {
		case 0:
			System.out.println("You found a Skeleton!");
			Monster monster=new Monster("Skeleton");
			Events.battleEvent(player, monster, "Fight the Skeleton k thx");
			System.out.println("Battle is over!");
			break;
		case 1:
			Potions potion = new Potions();
			System.out.println("You found a "+potion.getName()+", I wonder how long its been here...");
			giveItem(player, potion);
			player.displayInventory(); //delete in final revision
			break;
		default:
			break;
		}
	}

	public static int generateInt(int low, int high) {
		return ((int) ((Math.random() * 1000000000) % ((high + 1) - low)) + low);
	}
}

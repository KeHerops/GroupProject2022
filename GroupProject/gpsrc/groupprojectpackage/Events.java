package groupprojectpackage;

import java.util.Scanner;

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
			Monster monster = new Monster("Skeleton");
			Events.battleEvent(player, monster, "Fight the Skeleton k thx");
			System.out.println("Battle is over!");
			break;
		case 1:
			Potions potion = new Potions();
			System.out.println("You found a " + potion.getName() + ", I wonder how long its been here...");
			giveItem(player, potion);
			player.displayInventory(); // delete in final revision
			break;
		default:
			break;
		}
	}

	public static void wordGame(Player player) {
		int rounds=0;
		boolean playerWon = false;
		String word = wordGameWordRandomizer();
		String description=wordGameWordDescription(word);
		String wordHolder;
		char[] wordArray=word.toCharArray();
		System.out.println("here is event enter name");
		System.out.println(description);
		Scanner sc = new Scanner(System.in);
		char[] wordRevealArray= new char[word.length()];
		for(int i=0;i<wordRevealArray.length;i++)
			wordRevealArray[i]='#';
		System.out.println();
		while(rounds < 7)
		{
			for(char d:wordRevealArray)
				System.out.print(d);
			wordHolder=sc.nextLine();
			wordHolder=wordHolder.toUpperCase();
			char[] wordHolderArray=wordHolder.toCharArray();
			for(int i=0;i<wordArray.length;i++)
			{
				for(int j=0;j<wordHolderArray.length;j++)
				{
					if(wordHolderArray[j]==(wordArray[i]))
					{
						wordRevealArray[i]=wordHolderArray[j];
					}
				}
			}
			if(wordHolder.equals(word)) {
				System.out.println("Yay you did it. you got it right.");
				break;
			}
			else if(wordRevealArray.equals(wordArray))
			{
				System.out.println("The world was revealed! it was "+ word);
				playerWon=true;
			}
			else
				System.out.println("You got it wrong");
			
			
		}
		
		if(rounds < 7|| playerWon==true)
		{
			System.out.println("You get a potion");
		}
		else
		{
			System.out.println("You lose");
		}
		
		
	}
	
	public static String wordGameWordDescription(String word) {
		String description = null;
		switch (word) {
		case "CHRONOS":
			description = "You see a old withered man holding an hour glass and turning the zodiac wheel.";
			break;
		case "NYX":
			description = "You see a women clad in a dress with symbols of the moon and stars around her.";
			break;
		case "HADES":
			description = "You see an old man in a cloak, holding a scythe in his hand. He is is a small raft on a river.\n"
					+ "There are hands reaching out from underneath the water.";
			break;
		case "ATHENA":
			description = "You see a woman, strong and confident clad in battle worn armor.\nShe stands on her defeated foe with a large weapon. ";
			break;
		case "ZEUS":
			description = "You see a an old man with a strong body. He is holding what looks like lightning bolts.";
			break;
		case "THOR":
			description = "You see a young man with a muscular body. He poses with his weapon in the air that is struck with lightning."
					+ "\nIt looks like a hammer.";
			break;
		case "ODIN":
			description = "You see an old man with an eyepatch. He sits upon a throne with an raven on his shoulder.";
			break;
		case "LOKI":
			description = "You see a young man with a mischievous smile, he seems likes a trickster. There is a cow with multiple legs behind him.";
			break;
		case "ANUBIS":
			description = "You see a tall man, but where his head should be, it is replaced with a jackal's head.\n"
					+ "In one hand he holds a heart, and in the other he holds a sickle. There are tombs behind him.";
			break;
		case "Helios":
			description = "You see a titan of a man in a chariot, being drawn by several horses. Behind him he drags the Sun.";
			break;
		case "SELENE":
			description = "You see a titan of a woman in a chariot, being drawn by a pair of winged steeds. Behind her is the Moon.";
			break;
		case "KRATOS":
			description = "A frightning strong man, he is wields bloody weapons and around him are dead bodies"
					+ "that appear to look like a pantheon of gods...";
			break;
		
		default:
			System.out.println("Error in descripton for word game found");
			break;
		}
		return description;
	}

	public static String wordGameWordRandomizer() {
		String word = null;
		switch (generateInt(1, 12)) {
		case 1:
			word = "CHRONOS";
			break;
		case 2:
			word = "NYX";
			break;
		case 3:
			word = "HADES";
			break;
		case 4:
			word = "ATHENA";
			break;
		case 5:
			word = "ZEUS";
			break;
		case 6:
			word = "THOR";
			break;
		case 7:
			word = "ODIN";
			break;
		case 8:
			word = "LOKI";
			break;
		case 9:
			word = "ANUBIS";
			break;
		case 10:
			word = "Helios";
			break;
		case 11:
			word = "SELENE";
			break;
		case 12:
			word = "KRATOS";
			break;
		
		default:
			word=wordGameWordRandomizer();
			break;
		}
		return word;
	}

	public static int generateInt(int low, int high) {
		return ((int) ((Math.random() * 1000000000) % ((high + 1) - low)) + low);
	}
}

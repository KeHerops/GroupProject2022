package groupprojectpackage;

public class Levels {
	
	private String description;
	private String d;
	private String anotherD="on to the next level";
	
	public final void LEVEL_ZERO(Player player) {
		description=GameStrings.getGeneralStoryDescription();
		d= "This is middle description or whatever we want";
		
		System.out.println(description);
		
		System.out.println(d);
		switch(Events.generateInt(0,1)) {
		case 0:
			Monster monster= new Monster("Skeleton");
			System.out.println("this is event chance 0");
			Events.battleEvent(player, monster, GameStrings.battle_description_1_1);
			break;
			
		case 1:
			System.out.println("this is event chance 1");
			Events.somethingShiny(player);
			break;
			
		case 2:
			System.out.println("this is event chance 2");
			Events.lookAround(player, "Look around event has occured, you look around!");
			break;
			
		default:
			System.out.println("this is default you should not be seeing this...");

			break;

		}
		
		System.out.println(anotherD);

	}
	
	
	
}

package groupprojectpackage;

public final class GameStrings {

	// Strings will be split up for different parts of the game, look at headers
	
	// ***************************************************************************
	// Battle Description point
	// ***************************************************************************

	public final static String battle_description_1_1 = "Here is a generic fight between player and monster, FIGHT";

	public static String getBattleDescription1_1() {
		return battle_description_1_1;
	}

	private final static String mimic_encounter = "As you get closer to the chest, the chest shifts and opens "
			+ "it's mouth to attack!";

	public static String getMimicEncounter() {
		return mimic_encounter;
	}

	
	
	
	
	// ***************************************************************************
	// Event Description point
	// ***************************************************************************

	private final static String EVENT_CHEST_STRING = "How lucky you found a chest!";

	public static String getShinyEncounter() {
		return EVENT_CHEST_STRING;
	}
	
	
	
	

	// ***************************************************************************
	// General Description point
	// ***************************************************************************
	
	

	private final static String GENERAL_STORY_DESCRIPTION="This is a general story description string";
	
	public static String getGeneralStoryDescription() {
		return GENERAL_STORY_DESCRIPTION;
	}
	
	

}

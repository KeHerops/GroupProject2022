package groupprojectpackage;

import java.util.Scanner;

public final class GameLogic {
	
private GameLogic() {}; // no no don't create an instance of this class

public static Player chooseName() {
	try  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a name: ");		
		String name = sc.nextLine();
		Player player = new Player(name, 0);
		sc.close();
		return player;
	}
	catch(Exception e) {
		
	}
	return null;
}


}

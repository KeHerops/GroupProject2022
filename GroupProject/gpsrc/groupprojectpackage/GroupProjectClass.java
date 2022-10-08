package groupprojectpackage;

import java.util.Scanner;

public class GroupProjectClass	{
	

	public static void main(String[] args) 
	{
		boolean c = true;
//		String name;
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("What is your name?: ");
//			name=sc.nextLine();
//		}
		Player p=new Player("Kevin", 10);
		System.out.printf("Name: %s, Health: %d\n", p.getName(),p.getHealth());
		while(c == true)
		{
			System.out.println("You will be hit for 6 damage");
			p.damaged(6);
			System.out.printf("Name: %s, Health: %d\n", p.getName(),p.getHealth());
			if(p.getHealth()<=0)
				c=false;
		}
		
		for(int i=0; i<5;i++)
		{
			System.out.printf("you will be healed for %d", Potions.getBasicHealthPotion() );
			p.healed(Potions.getBasicHealthPotion());
			System.out.printf("Name: %s, Health: %d\n", p.getName(),p.getHealth());

		}
		
	}
		
}

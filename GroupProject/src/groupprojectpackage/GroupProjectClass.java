package groupprojectpackage;

import java.util.Scanner;

public class GroupProjectClass {
	public static float comissions(float sales, float comission_rate)
	{
		return sales*comission_rate;
	};

	public static void main(String[] args) {

		float sales=0f,  comission_rate=0f;
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Please insert total amount of sales: $");
			sales = myObj.nextFloat();
		}
		if(sales<=10000)
		{
			comission_rate=.10f;
			System.out.printf("Commission total: %,.2f",comissions(sales, comission_rate));
		}
		else if (sales<=15000)
		{
			comission_rate=.15f;
			System.out.printf("Commission total: %,.2f",comissions(sales, comission_rate));
		}
		else if(sales>15000)
		{
			comission_rate=.2f;
			System.out.printf("Commission total: %,.2f",comissions(sales, comission_rate));
		}
		else
			System.out.println("I don't know how you got here, but you made a wrong turn. Go back.\n");
	}

}

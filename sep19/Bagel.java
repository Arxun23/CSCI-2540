package sep19;

import java.util.Scanner;

public class Bagel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		try
		{
		
		int totalSugar, singleSugar;
		int bagel;
		
		System.out.print("Enter the gram of sugar used: ");
		totalSugar = keyboard.nextInt();
		System.out.print("Enter the number of bagel: ");
		bagel = keyboard.nextInt();
		keyboard.close();
		if(bagel < 1)
		{
			throw new Exception("Exception: No bagel entered!");
		}
		
		singleSugar = totalSugar / bagel;
		
		System.out.println("Each bagel has " + singleSugar + " grams of sugars!!");
			
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}

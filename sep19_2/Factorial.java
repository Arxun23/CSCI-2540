package sep19_2;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//Scanner keyboard2 = new Scanner(System.in);
		
		try
		{
			long num, result =0;
			System.out.println("Enter the value for the factorial equation: ");
			num = keyboard.nextInt();
			keyboard.close();
			if (num < 0)
			{
				//keyboard2.close();
				throw new NegativeInputException("Exception: Negative numbers not allowed");
			}
			else if (num == 0)
			{
				result = 1;
			}
			else
			{
				for(int x = 1; x <= num; x++)
				{
					result = num * x;
				}
			}
			
			System.out.println("The factorial of "+ num + " is "+ result);
		}
		
		catch(NegativeInputException e)
		{
			System.out.println(e.getMessage());
		}
		
		try {
			int num2;  
			int result =0;
			System.out.println("Try again: ");
			num2 = keyboard.nextInt();
			if(num2 < 0)
			{
				System.out.println("Test");
				//keyboard2.close();
				throw new Exception();
			}
			else if (num2 == 0)
			{
				result = 1;
			}
			else
			{
				for(int x = 1; x <= num2; x++)
				{
					result = num2 * x;
				}
			}
			
			System.out.println("The factorial of "+ num2 + " is "+ result);
			
		}
		
		catch(Exception e)
		{
			System.exit(1);
		}
		
		keyboard.close();
		//keyboard2.close();

}}

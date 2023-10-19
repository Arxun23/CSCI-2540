package fraction;
import java.util.Scanner;
/**
 * @author Luis Sanjuan-Cruz
 */
public class Fraction {

	/**
	 * is the main menu for the calculator
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fract1;
		String fract2;
		
		int choice;
		
		int num1, dem1, num2, dem2;
		
		do
		{
		Scanner myChoice = new Scanner(System.in);
		System.out.println("****Welcome to the fraction calculator****");
		System.out.println("****Pick an option****");
		System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Quit");
		
		choice = myChoice.nextInt();
		
		//Terminates the program completely
		if(choice == 5)
		{
			System.out.println("The calculator has now been terminated!! Have a fantastic day");
			myChoice.close();
			System.exit(0);
		}
		
		//Takes in the first fraction
		System.out.println("Type in your first fraction (ex. 1/2, 2/3): ");
		fract1 = myChoice.next();
		String[] fr1 = fract1.split("/");
		num1 = Integer.parseInt(fr1[0]);
		dem1 = Integer.parseInt(fr1[1]);
		
		//Takes in the second fraction
		System.out.println("Type in your second fraction (ex. 1/2, 2/3): ");
		fract2 = myChoice.next();
		String[] fr2 = fract2.split("/");
		num2 = Integer.parseInt(fr2[0]);
		dem2 = Integer.parseInt(fr2[1]);
		
		//Skips the current calculation if there's a 0 in the dem
		if(dem1 == 0 || dem2 == 0)
		{
			System.out.println("Invalid demoninator detected. Try again");
		}
		else
		{
		System.out.print("The answer is: ");
		switch(choice){
			case 1:
				add(num1, dem1, num2, dem2);
				break;
			case 2:
				subtract(num1, dem1, num2, dem2);
				break;
			case 3:
				multiply(num1, dem1, num2, dem2);
				break;
			case 4:
				divide(num1, dem1, num2, dem2);
				break;
		}
		}
		
		System.out.println("");
		}
		while (choice != 5);
	}
	
	/**
	 * adds the fractions together
	 * @param num1
	 * @param dem1
	 * @param num2
	 * @param dem2
	 */
	public static void add(int num1, int dem1, int num2, int dem2)
	{
		int num,dem;
		if(dem1 != dem2)
		{
			num1 = num1 * dem2;
			num2 = num2 * dem1;
			dem = dem1 * dem2;
		}
		else
		{
			dem = dem1;
		}
		num = num1 + num2;
		
		ans(num,dem);
		
		return;
	}
	
	/**
	 * subtracts the fractions
	 * @param num1
	 * @param dem1
	 * @param num2
	 * @param dem2
	 */
	public static void subtract(int num1, int dem1, int num2, int dem2)
	{
		int num,dem;
		if(dem1 != dem2)
		{
			num1 = num1 * dem2;
			num2 = num2 * dem1;
			dem = dem1 * dem2;
		}
		else
		{
			dem = dem1;
		}
		num = num1 - num2;
		
		ans(num,dem);
		
		return;
	}
	
	/**
	 * Multiplies the fractions
	 * @param num1
	 * @param dem1
	 * @param num2
	 * @param dem2
	 */
	public static void multiply(int num1, int dem1, int num2, int dem2)
	{
		int num = num1 * num2;
		int dem = dem1 * dem2;
			
		ans(num,dem);
		return; 
	}
	
	/**
	 * Divides the fractions
	 * @param num1
	 * @param dem1
	 * @param num2
	 * @param dem2
	 */
	public static void divide(int num1, int dem1, int num2, int dem2)
	{
		int num = num1 * dem2;
		int dem = dem1 * num2;
		
		ans(num,dem);
		return;
	}
	
	/**
	 * Converts the num and dem into a fraction string
	 * @param num
	 * @param dem
	 */
	public static void ans(int num, int dem)
	{
		String ans;
		
		if(num == 0)
		{
			ans = "0";
		}
		else if(dem == 0)
		{
			ans = "Invalid fraction";
		}
		else if(num == dem)
		{
			ans = "1";
		}
		else
		{
			ans = (num / gcd(num,dem)) + "/" + (dem/gcd(num,dem));
		}
		System.out.println(ans);
		return;
	}
	
	/** 
	 * finds the GCD to simplify the fraction
	 * @param integerOne
	 * @param integerTwo
	 * @return
	 */
	public static int gcd(int integerOne, int integerTwo)
	{
		int result;
		if(integerOne % integerTwo == 0)
		{
			result = integerTwo;
		}
		
		else
		{
			result = gcd(integerTwo, integerOne % integerTwo);
		}
		
		return result;
	}
	
	
}

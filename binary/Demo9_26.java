package binary;
import java.util.Scanner;
/*
 * @author Luis Sanjuan-Cruz
 */

public class Demo9_26 {

	public static void main(String[] args) {
		//Sets up arrays and length
		int min = 0;
		int num [] = {12, 15, 17, 18, 19, 20, 25, 30, 35, 41};
		int length = num.length;
		
		//Takes user input
		Scanner myobj = new Scanner(System.in);
		System.out.println("What number do you want to find: ");
		int find = myobj.nextInt();
		
		// Calls the method for the first time
		int found = binarySearch(num, min, length -1, find);
		
		//Displays the result
		if(found == -1)
		{
			System.out.println("Unable to find number");
		}
		else
		{
			System.out.println("Number found at index " + found + " of 9");
		}
		
		myobj.close();	
	}

	/*
	 * Actually does the binary search. Needs the array, first and last position, and what the user wants to find
	 */
	public static int binarySearch(int num[],int min,int max, int find)
	{
		if (max >= min && min <= num.length -1)
		{
		// Sets up mid int
		int mid = min +(max - min) / 2;
		
		// Checks if the mid matcher
		if (num[mid] == find)
		{
			return mid;
		}
		
		// In case the mid is higher than what's being looked for
		if (num[mid] > find)
		{
			return binarySearch(num, min, mid - 1, find);
		}
		
		// In case the mid is lower than what's being looked for
		return binarySearch(num, mid + 1, max, find);
		
		}
		
		return -1;
	}
}

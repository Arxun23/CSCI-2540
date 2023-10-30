package javapractice;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You want to see all the prime numbers in between 1 and what number? ");
		Scanner myinput = new Scanner(System.in);
		int choice;
		choice = myinput.nextInt();
		printPrime(choice);
		myinput.close();
		}
	public static boolean primenum(int num ) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return false;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for (int i =5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0)
			{
				return false;
			}
		}
		return true;
	}
	

	public static void printPrime(int choice)
	{
		System.out.println("The prim numbers in between 1 and " + choice + " are:");
		for (int i = 2; i <= choice; i++)
		{
			if(primenum(i))
			{
				System.out.println(i + " ");
			}
		}
	}
}
	



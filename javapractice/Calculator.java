package javapractice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	System.out.println("Hello Java!");
	System.out.println("Please enter two integers: ");
	
	int a,b;
	
	Scanner myInput = new Scanner(System.in);
	a = myInput.nextInt();
	b = myInput.nextInt();
	
	System.out.println("The sum of the number is: " + (a + b));
	
	myInput.close();
	

	}

}

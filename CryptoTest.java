package cryptography;
import java.util.Scanner;

public class CryptoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crypto word = new Crypto();
		int count = 0;
		Scanner myinput = new Scanner(System.in);
		
		System.out.println("Enter a shift key: ");
		int num = myinput.nextInt();
		
		word.setShift(num);
		word.gettemp();
		word.movechar();
		
		System.out.println("Shift Key Set");
		System.out.println("Enter a word you would like encrypted: ");
		char[] a = myinput.next().toCharArray();
		for (int i = 0; i < a.length; i++)
		{
	         count =count +1;
		}
		
		word.encrypt(a, count);
		
		
		myinput.close();
		
		
	}

}

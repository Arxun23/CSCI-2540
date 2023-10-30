package bankdatabase;
import java.util.Random;
// Luis Sanjuan-Cruz
public class Banktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] allcustomers = new Account [5];
		allcustomers[0] = new Account("A001", "Jack Will");
		allcustomers[1] = new Account("A002", "Bobby Fuegerson");
		allcustomers[2] = new Account("A003", "Jhonny Bravo");
		allcustomers[3] = new Account("A004", "John Cena");
		allcustomers[4] = new Account("A005", "Dwayne Johnson");
		
		Random start = new Random();
		int num;
		double average = 0;
		for(int x = 0; x < 5; x++)
		{
			num = start.nextInt(900);
			num = num + 100;
			allcustomers[x].setBalance(num);
			average =+ num;
		}
		
		average = average/5;
		
		System.out.println("The average of the account balances is: " + average);
		
	}

}

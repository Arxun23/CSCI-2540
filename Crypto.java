package cryptography;
/**
 * @author Luis Sanjuan-Cruz
 */
//Sets up parameters for ciper
public class Crypto {
	private int shift;
	private char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private char [] shifted = new char[26];	
	private char [] Temp;

	
	//makes the encryption key
	public void movechar()
	{
		int y = 0;
		for(int x = shift; x < 26; x++)
		{
			shifted[y] = alphabets[x];
			y = y+ 1;
		}
		
		for(int x = 0; x < shift; x++)
		{
			shifted[y] = Temp[x];
			y = y + 1;
		}
		

	}
	
	//Encrypts the word
	public void encrypt(char word[], int count)
	{
		char [] encrypeted = new char[count];
		for (int x = 0; x < count; x++)
		{
			for (int y = 0; y < 26; y++ )
			{
				if (word[x] == alphabets[y])
				{
					encrypeted [x] = shifted[y];
				}
			}
		}
		String code = String.valueOf(encrypeted);
		System.out.println("The key is: " + code);
		
		char [] passcode = new char[count];
		for (int x = 0; x < count; x++)
		{
			for (int y = 0; y < 26; y++ )
			{
				if (encrypeted[x] == shifted[y])
				{
					passcode [x] = alphabets[y];
				}
			}
		}
		String pass = String.valueOf(passcode);
		System.out.println("The phrase is: " + pass);
		
		
	}
	

//Sets up shift key
	public void setShift(int shift) {
		this.shift = shift;
	}
	
	// helps with the key
	public void gettemp()
	{
		this.Temp = new char[shift];

		int y = 0;
		for (int x = 0; x < shift; x++)
		{
			Temp[y] = alphabets[x];

			y = y + 1;
		}
		
	}
	
	
	

}

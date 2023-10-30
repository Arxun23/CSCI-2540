package bankdatabase;
/**
 * This is a class to create account obj
 * Each obj is for one customer.
 * @author Luis Sanjuan-Cruz
 */
public class Account {
	private String ID;
	private String name;
	private double balance;
	private static double interest = 0.065;
	private static int num = 0;
	/** 
	 * a public variable for making accounts
	 */
	
	public Account(String ID, String name)
	{
		this.ID = ID;
		this.name = name;
		balance = 0;
		num += 1;
	}
	
	/**
	 * a variable that gets the balance
	 * 
	 */
	
	public void getBalance()
	{
		System.out.println("The balance is " + balance);
	}
	
	/**
	 * A variable that sets balance
	 * @param bal
	 */
	public void setBalance(double bal)
	{
		this.balance = bal;
	}
	
	/**
	 * A variable that gets the variable
	 */
	
	public void getInterest()
	{
		System.out.println("The interest is " + interest);
	}
	
	/**
	 * Withdraws amount
	 * @param amount
	 */
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
		System.out.println("The new balance is " + balance);
	}
	
	/**
	 * Deposits amount
	 * @param amount
	 */
	
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("The new balance is " + balance);
	}
	
	/**
	 * Displays how long it would take to reach a amount
	 * @param goal
	 */

	public void interestTime(double goal)
	{
		int years = 0;
		while (balance > 0)
		{
			if (balance < goal)
			{
				balance = balance * (1 + 0.065) ; 
				years = years + 1;
			}
			else
			{
				System.out.println("Account# " + ID + " would take " + years + " year(s) for the balance to double");
				break;
			}
			 
		}
		
	}
	
	/**
	 * Here so the num value is "used"
	 * @return
	 */

	public static int getNum() {
		return num;
	}
	
	/**
	 * here so the name value is "used"
	 * @return
	 */

	public String getName() {
		return name;
	}
	
	/**
	 * Here so the ID value is "used"
	 * @return
	 */

	public String getID() {
		return ID;
	}
}

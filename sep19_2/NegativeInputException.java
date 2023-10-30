package sep19_2;


public class NegativeInputException extends Exception {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeInputException() {
		// TODO Auto-generated constructor stub
		super("Why you input negative...");
	}
	
	public NegativeInputException(String message)
	{
		super(message);
				
		
		
	}

}

package stackPractice;
/**
 * @author Luis Sanjuan-Cruz
 */

public class ArrayStack<T> {
	private T[] data;
	private int capacity;
	private int count;
	
	/**
	 * Makes the stack
	 */
	public ArrayStack()
	{
		capacity = 5;
		data = (T[])new Object[capacity];
		count = 0;
	}
	
	/**
	 * Adds to the stack
	 * @param a
	 */
	public void push(T a)
	{
		if(count >= capacity)
		{
			T [] newArr = (T[])new Object[capacity * 2];
			
			for(int i = 0; i < count; i++)
			{
				newArr[i] = data[i];
			}
			
			data = newArr;
			capacity *= 2;
		}
		
		data[count++] = a ;
	}
	
	/**
	 * Gets rid of the top of the stack
	 * @return
	 * @throws Exception
	 */
	public T pop() throws Exception
	{
		if(count == 0)
		{
			throw new Exception("The stack is empty!");
		}
		count -= 1;
		return data[count];
		
	}
	
	/**
	 * Displays the top 
	 * @return
	 * @throws Exception
	 */
	public T peek() throws Exception
	{
		if(count == 0)
		{
			throw new Exception("The stack is empty!");
		}
		return data[count - 1];
	}
	
	/**
	 * Displays the entire stack
	 */
	public void Display() 
	{
		System.out.println("The elements from top to bottom are: ");
		for(int i = count - 1; i >= 0; i--)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
	}
	
	/**
	 * clears the entire stack
	 * @throws Exception
	 */
	public void clear() throws Exception
	{
		if(count == 0)
		{
			throw new Exception("The stack is empty!");
		}
		for (int x = capacity - 1; x >= 0; x--)
		{
			count -= 1;
		}
	}
	
	/**
	 * checks if the stack is empty
	 * @return
	 */
	boolean isEmpty()
	{
		if (count >= 0)
		{
			return false;
		}
		return true;
		
		
	}
	
	public static void main(String[] args)
	{
		//Fills the stack with values
		ArrayStack myStack = new ArrayStack();
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.push(6);
		myStack.push(7);
		
		//Test pop
		try
		{
			myStack.pop();
		}
		catch (Exception e)
		{
			System.out.print(e.getMessage());
		}
		
		//test display
		myStack.Display();
		
		//Test peek
		try
		{
			System.out.print("Peek: ");
			System.out.println(myStack.peek());
			System.out.println("The Array sould be the same");
			myStack.Display();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//Tests clear
		try {
		System.out.println("The stack will clear ");
		myStack.clear();
		
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//Tests isEmpty
		System.out.println("Is it empty: " +  myStack.isEmpty());
		
	}
}

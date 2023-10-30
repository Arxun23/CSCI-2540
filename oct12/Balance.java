package oct12;

import java.util.Stack;

/**
 * @author Luis Sanjuan-Cruz
 */

public class Balance<T> {
	private T[] data;
	private int capacity;
	private int count;
	
	/**
	 * Makes the stack
	 */
	public Balance()
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
		
		String eq1 = "{ a + b * [ c - ( d +_e ) + f ] - g} * k";
		String eq2 = "a + [ b - ( c - d ) * f )";
		
		System.out.println("Expression 1 is balanced: " + balanceCheck(eq1));
		System.out.println("Expression 2 is balanced: " + balanceCheck(eq2));
		
	}
	
	public static boolean balanceCheck(String eq)
	{
		Stack<Character> stack = new Stack<>();
		
		for (int i =0; i < eq.length(); i++)
		{
			char c = eq.charAt(i);
			
			if(c == '(' || c == '[' || c == '{')
			{
				stack.push(c);
			}
			else if (c == ')' || c == ']' || c == '}')
			{
				if (stack.isEmpty())
				{
					return false;
				}
				
				char top = stack.pop();
				
				if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top !='{' ))
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	
}

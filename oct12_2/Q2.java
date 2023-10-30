package oct12_2;
import java.util.Stack;
/**
 * @author Luis Sanjuan-Cruz
 */
public class Q2 {

	//initalizes the equation
	public static void main(String[] args) {
		
		String eq1 = "{ a + b * [ c - ( d +_e ) + f ] - g} * k";
		String eq2 = "a + [ b - ( c - d ) * f )";
		
		System.out.println("Is Equation 1 balanced: " + balanceCheck(eq1));
		System.out.println("Is Equation 2 balanced: " + balanceCheck(eq2));
		
	}
	
	/**
	 * checks if the equation is true or false
	 * @param eq
	 * @return
	 */
	public static boolean balanceCheck(String eq)
	{
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < eq.length(); i++)
		{
			char ch = eq.charAt(i);
			if(ch == '{' || ch == '[' || ch == '(')
			{
				stack.push(ch);
			}
			else if(ch == '}' || ch == ']' || ch == ')')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				char top = stack.pop();
				if ((ch == '}'&& top != '{') || (ch == ']' && top != '[') || (ch == ')' && top !='('))
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}

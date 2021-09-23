/** This imports the java Stack
 * class and its methods so that 
 * this class can use and call those
 * structured methods.
 * 
 */
import java.util.Stack;

/** The purpose of this class is to
 * test whether or not a string is a 
 * palindrome using a stack.
 * 
 * @author morganhardin
 *
 */
public class Palindrome
{
	/** These two private instances of 
	 * stacks great a forward and a backward
	 * stack so that they can be compared
	 * to one another in the testPalindrome
	 * method.
	 * 
	 */
	@SuppressWarnings("rawtypes")
	private Stack original = new Stack();
	@SuppressWarnings("rawtypes")
	private Stack reversed = new Stack();
	
	/** This void method takes the string
	 * parameter item. It then loops through
	 * each character in the item and pushes 
	 * that into the stack. The reverse 
	 * method is then called so that the
	 * testPalindrome method can compare the
	 * two stacks. With the while loop, it
	 * runs while both the stacks are not
	 * empty. It then pops both stacks and
	 * compares them to one another. If the
	 * two stacks equal one another, then the
	 * string is a palindrome. If not, then
	 * it is not a palindrome.
	 * 
	 * @param item
	 */
	@SuppressWarnings("unchecked")
	public void testPalindrome(String item)
	{
		for (int i = 0; i < item.length(); i++)
		{
			original.push(item.charAt(i));
		}
		reverse(item);
		while (!original.empty() && !reversed.empty())
		{
			if (original.pop().equals(reversed.pop()))
			{
				System.out.println(item + " is a palindrome.");
				break;
			}
			else
			{
				System.out.println(item + " is not a palindrome.");
				break;
			}
		}
	}
	/** This void method is called from testPalindrome
	 * method. It takes a parameter item of type string.
	 * It contains a for loop that goes backwards and 
	 * takes the last character of the string and pushes 
	 * that onto the stack. It then goes in reverse, 
	 * pushing until all the characters are in the stack.
	 * 
	 * @param item
	 */
	@SuppressWarnings("unchecked")
	public void reverse(String item)
	{
		for (int i = item.length()-1; i >= 0; i--)
		{
			reversed.push(item.charAt(i));
		}
	}
}

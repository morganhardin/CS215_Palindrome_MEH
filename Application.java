/** This imports the Java Scanner so that
 * it can ask the user to input a string to
 * be tested as a palindrome.
 * 
 */
import java.util.Scanner;

/** This is the application class that has a
 * main method and will be creating a new instance
 * of the Palindrome class that will run and 
 * test whether an inputed word is a palindrome.
 * 
 * @author morganhardin
 *
 */
public class Application 
{
	/** Main method that allows this code
	 * and the instantiated Palindrome code
	 * to run and be executed.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Palindrome Palindrome = new Palindrome();
		Scanner input = new Scanner(System.in);
		
		boolean answer = true;
		
		while (answer == true)
		{
			System.out.print("Enter a word or phrase to test: ");
			String word = input.nextLine();
			Palindrome.testPalindrome(word);
			
			System.out.print("Would you like to test another word or phrase? ");
			String choice = input.nextLine().toUpperCase();
			if (choice.contains("Y"))
			{
				answer = true;
			}
			else if (choice.contains("N"))
			{
				answer = false;
			}
		}
		input.close();
	}
}

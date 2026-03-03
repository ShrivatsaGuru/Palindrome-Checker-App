/**
 * ============================================================
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */
public class UCTwoPalindrome {
	public static void main(String[] args)
	{
		String name="madam";
		int n=name.length();
		System.out.println("Input text: "+name);
		boolean isPalindrome=true;
		
		//loop only till half of the string length
		for(int i=0;i<=n/2;i++)
		{
			if(name.charAt(i)!=name.charAt(n-i-1))
			{
				isPalindrome=false;
				break;
			}
		}
		System.out.println("Is a palindrome? - "+isPalindrome);
		
		
	}
}

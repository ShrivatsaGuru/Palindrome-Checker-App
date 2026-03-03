/**
 * ============================================================
 * MAIN CLASS – UseCase3PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */
import java.util.*;
public class UCThreePalindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Original text: ");
		String name=sc.nextLine();
		String reverse="";
		boolean isPalindrome=true;
		int length=name.length();
		//Iterate from last character to first.
		for(int i=length-1;i>=0;i--){
			reverse+=name.charAt(i);
		}
		isPalindrome=name.equals(reverse);
		System.out.println("Reversed text: "+reverse);
		System.out.println("isPalindrome? :"+isPalindrome);
	}
}
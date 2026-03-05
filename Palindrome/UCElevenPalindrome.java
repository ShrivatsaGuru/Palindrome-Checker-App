/**
 * ===============================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 *
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * This improves:
 *  - Reusability
 *  - Readability
 *  - Separation of concerns
 *
 * @author Developer
 * @version 11.0
 */
import java.util.Scanner;
public class UCElevenPalindrome {
    public static void main(String[] args) {

        PalindromeChecker pc = new PalindromeChecker();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text=sc.nextLine();
        if (pc.checkPalindrome(text))
            System.out.println("Palindrome!");
        else
            System.out.println("Not a palindrome.");
    }
}

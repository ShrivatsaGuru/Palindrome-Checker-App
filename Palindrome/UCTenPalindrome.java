/**
 * ===============================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 *  - Removing spaces and symbols
 *  - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */
import java.util.*;
public class UCTenPalindrome{
    static boolean isPal(String s) {
        String t = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase(); // normalize
        return rec(t, 0, t.length()-1);
    }
    private static boolean rec(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return rec(s, i+1, j-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.err.print("Enter Text: ");
        String s=sc.nextLine();
        System.out.print(isPal(s)?"Palindrome":"Not a palindrome");

    }
}
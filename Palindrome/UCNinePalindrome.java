/**
 * ===============================================================
 * MAIN CLASS – UseCase9RecursivePalindrome
 * ===============================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 *  - All characters are matched, or
 *  - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */
import java.util.*; 
public class UCNinePalindrome {
    static boolean isPal(String s) {
        return rec(s, 0, s.length() - 1);
    }
    // Recursively compare start and end
    private static boolean rec(String s, int i, int j) {
        if (i >= j) return true;                 // base case: done / single char
        if (s.charAt(i) != s.charAt(j)) return false; // mismatch
        return rec(s, i + 1, j - 1);             // move inward
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.err.print("Enter Text: ");
        String s=sc.nextLine();
        System.err.println(isPal(s)?"Palindrome":"Not a palindrome");
    }
}

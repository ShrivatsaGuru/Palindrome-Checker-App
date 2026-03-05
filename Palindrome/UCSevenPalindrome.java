/**
 * ===============================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *
 *  - removeFirst()
 *  - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 *
 * @author Developer
 * @version 7.0
 */

import java.util.*;

public class UCSevenPalindrome {

    static boolean isPalindrome(String s) {
        Deque<Character> d = new ArrayDeque<>();
        for (char c : s.toCharArray()) d.addLast(c);   // insert
        while (d.size() > 1) {
            if (!Objects.equals(d.removeFirst(), d.removeLast())) return false; // compare
        }
        return true; // empty or single char
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter Text: ");
        String s=sc.nextLine();
        System.out.println(isPalindrome(s) ? "Palindrome" : "Not Palindrome");
    }
}
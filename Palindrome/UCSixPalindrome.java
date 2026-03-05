/**
 * ===============================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 *  - Queue (FIFO – First In First Out)
 *  - Stack (LIFO – Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 *
 * @author Developer
 * @version 6.0
 */
import java.util.*;

public class UCSixPalindrome
{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Text: ");
        String s = sc.nextLine();

        Queue<Character> q = new ArrayDeque<>();
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            q.offer(c);   // enqueue
            st.push(c);   // push
        }

        boolean ok = true;
        while (!q.isEmpty()) {
            if (q.poll() != st.pop()) {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "Palindrome" : "Not Palindrome");
    }
}
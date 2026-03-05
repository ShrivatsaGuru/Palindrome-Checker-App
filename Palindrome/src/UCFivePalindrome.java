/**
 * ===============================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 *  - Pushes characters into a stack
 *  - Pops them in reverse order
 *  - Compares with original sequence
 *  - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Scanner;
import java.util.Stack;

public class UCFivePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        sc.close();
        //Push characters first
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        // Pop characters in reverse
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        //Check and compare
        boolean isPalindrome = input.equals(reversed.toString());
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + reversed);
        System.out.println(isPalindrome ? "Palindrome" : "Not a palindrome");
    }
}
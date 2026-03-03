/**
 * ============================================================
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */

import java.util.*;
public class UCFourPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input ");
        char[] charArray=sc.nextLine().toCharArray();
        boolean isPalindrome=true;
        int length=charArray.length;
        //Two pointer Approach
        for(int i=0;i<length/2;i++)
        {
            if(charArray[i]!=charArray[length-i-1])
            {
                isPalindrome=false;
                break;
            }
        }
        System.out.println("Is Palindrome? :"+isPalindrome);
    }
}

/*
This class is responsible for checking 
if the given string is a palindrome

@version: 11.0
@author: Developer
 */
public class PalindromeChecker {

    // Public method exposed to the user (Encapsulation + SRP)
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Normalize (ignore spaces + case)
        String s = input.replaceAll("\\s+", "").toLowerCase();

        // Simple two‑pointer palindrome check
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
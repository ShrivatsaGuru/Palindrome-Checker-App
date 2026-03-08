/*
This class provides a Stack based 
strategy to check if the given string
is a palindrome or not

@version: 12.0
@author: Developer
*/
import java.util.Stack;

public class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) st.push(c);
        for (char c : s.toCharArray()) if (c != st.pop()) return false;
        return true;
    }
}
/*
This class provides a Deque based 
strategy to check if the given string
is a palindrome or not

@version: 12.0
@author: Developer
*/
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        Deque<Character> d = new ArrayDeque<>();
        for (char c : s.toCharArray()) d.addLast(c);
        while (d.size() > 1)
            if (!d.removeFirst().equals(d.removeLast())) return false;
        return true;
    }
}
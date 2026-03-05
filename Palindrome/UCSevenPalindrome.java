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
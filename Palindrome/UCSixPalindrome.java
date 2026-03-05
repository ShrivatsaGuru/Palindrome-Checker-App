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
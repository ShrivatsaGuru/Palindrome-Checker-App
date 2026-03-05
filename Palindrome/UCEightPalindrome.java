/**
 * ===============================================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * ===============================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 *  - removeFirst()
 *  - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */

import java.util.Scanner;

public class UCEightPalindrome {
    static class Node 
    { 
        char v; 
        Node next; 
        Node(char v)
        {this.v=v;} 
    }

    static boolean isPalindrome(String s) {
        // build linked list
        Node head=null, tail=null;
        for(char c: s.toCharArray()){
            Node n=new Node(c);
            if(head==null) head=tail=n; else { tail.next=n; tail=n; }
        }

        // find middle
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null) slow=slow.next; // skip middle (odd length)

        // reverse second half
        Node prev=null, cur=slow;
        while(cur!=null){
            Node nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }

        // compare halves
        Node p1=head, p2=prev;
        while(p2!=null){
            if(p1.v!=p2.v) return false;
            p1=p1.next; p2=p2.next;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter text: ");
        String s=sc.nextLine();
        System.err.println(isPalindrome(s)?"Palindrome":"Not a palindrome");

    }
}

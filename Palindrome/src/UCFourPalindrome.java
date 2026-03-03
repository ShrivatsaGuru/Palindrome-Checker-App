import java.util.*;
public class UCFourPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input ");
        char[] charArray=sc.nextLine().toCharArray();
        boolean isPalindrome=true;
        int length=charArray.length;
        for(int i=0;i<length;i++)
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

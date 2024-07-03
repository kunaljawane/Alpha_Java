package Oracle;

import java.util.*;

public class numPalindrome {

    public static String isPalindrome(int a)
    {
        String s=String.valueOf(a);
        int len=s.length();
        String Y="Yes";
        String N="No";

        for(int i=0;i<len/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len-1-i))
            {
                return N;
            }
        }

        return Y;

        
    }
    
    public static void main(String[] args)
    {
        System.out.print("Enter the number:");

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        System.out.print("The Palindrome Result is:");
        System.out.println(isPalindrome(a));

        sc.close();
    }
}

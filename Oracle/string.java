package Oracle;

import java.util.Scanner;

public class string {
    public static void print(String s)
    {

        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+" ");
        }
    }

    public static boolean isPalindrome(String s)
    {
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        // String s= sc.nextLine();
        // System.out.println(s);
        // print(s);
        String s1=sc.next();
        // System.out.println(s1);
        System.out.println(isPalindrome(s1));
        sc.close();
    }
    
}

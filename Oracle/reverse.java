package Oracle;

import java.util.Scanner;

public class reverse {

    public static String rev(int a)
    {
        String s=String.valueOf(a);

        String res="";

        int len=s.length();

        for(int i=len-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            res=res+ch;
        }

        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the Number:");
        int a=sc.nextInt();
        System.out.println("Reverse of Number is:"+rev(a));
        sc.close();
    }
    
}

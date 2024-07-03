package Oracle;

import java.util.Scanner;

public class ifElse {

    public static void check(int a,int b)
    {
        if(a>b)
        {
            System.out.println("Greater number is:"+a);
        }
        else{
            System.out.println("The Greater number is:"+b);
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1:");
        int a=sc.nextInt();
        System.out.println("Enter Num2:");
        int b=sc.nextInt();

        check(a,b);
        sc.close();
    }
}

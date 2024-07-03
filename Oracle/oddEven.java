package Oracle;

import java.util.Scanner;

public class oddEven {

    public static void check(int a)
    {
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        check(num);
        sc.close();
    }
    
}

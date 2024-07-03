package Oracle;

import java.util.Scanner;

public class sumOfDigits {

    public static int getSum(int a)
    {
        int sum=0;
        while(a>0)
        {
            int last=a%10;
            sum=sum+last;
            a=a/10;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        System.out.println(getSum(n));
        sc.close();
    }
    
}

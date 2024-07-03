package Oracle;

import java.util.Scanner;

public class primeRange {

    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }

    public static void getRange(int a)
    {
        int count=0;

        for(int i=2;i<=a;i++)
        {
            int n=i;
            if(isPrime(n)==true)
            {
                count=count+1;

                System.out.print(n+" ");
            }
        }
        System.out.println("Total Prime Numbers:"+count);
    }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        getRange(a);
        sc.close();
    }
    
}

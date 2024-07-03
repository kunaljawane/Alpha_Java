package Oracle;

import java.util.Scanner;

public class factorial {

    public static int getFact(int n)
    {
        int res=1;
        for(int i=1;i<=n;i++)
        {
            res=res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.print("The Factorial is:");
        System.out.println(getFact(n));
        sc.close();
    }
    
}

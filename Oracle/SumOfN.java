package Oracle;
import java.util.*;

/**
 * SumOfN
 */
public class SumOfN {

    public static int getSum(int n)
    {
        return n*(n+1)/2;
    }

     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        System.out.print("The sum is:");
        System.out.print(getSum(n));
        sc.close();
     }
}


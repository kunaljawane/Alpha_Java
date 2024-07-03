package Oracle;

import java.util.Scanner;

public class OneToN {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Number:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
        }

        sc.close();
    }
    
}

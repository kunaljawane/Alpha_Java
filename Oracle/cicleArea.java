package Oracle;

import java.util.Scanner;

public class cicleArea {

    public static double printArea(int a)
    {
        double pi=(float)3.14;
        

        return (pi*(a*a));
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the Radius of Circle:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println((printArea(a)));
        sc.close();
    }
    
}

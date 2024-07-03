package Oracle;

import java.util.*;

public class cal {

    public static int add(int a,int b)
    {
        System.out.println("The addition is:");
        return(a+b);
    }

    public static int sub(int a,int b)
    {
        System.out.println("The substraction is:");
        return(a-b);
    }

    public static int Mult(int a,int b)
    {
        System.out.println("The multiplication is:");
        return(a*b);
    }

    public static int div(int a,int b)
    {
        System.out.println("The division is:");
        return(a/b);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter 1st Num:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter 2nd Num:");
        int b=sc.nextInt();

        System.out.println("---Menu---");
        System.out.println("1 for add");
        System.out.println("2 for sub");
        System.out.println("3 for Mult");
        System.out.println("4 for div");

        System.out.println("Enter Choice:");

        int ch=sc.nextInt();

        switch (ch) {
            case 1:System.out.println(add(a, b));
            break;
            case 2:System.out.println(sub(a, b));
            break;
            case 3:System.out.println(Mult(a,b));
            break;
            case 4:System.out.println(div(a, b));
            break;
            default:
            break;
        }

        sc.close();


    }
}

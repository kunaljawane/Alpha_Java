package Oracle;
import java.util.*;

public class Main {

    public static int area(int a , int b)
    {
        System.out.println("The area is:");
        return(a*b);

    }
    public static void main(String[] args) {
        System.out.println("My name is Kunal now I am back as an associate Oracle!!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println(area(a, b));
        sc.close();



    }
}

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b;
        System.out.print("Enter the 1st number:");
        a=sc.nextInt();
        System.out.print("Enter the 2nd number:");
        b=sc.nextInt();
        System.out.println("The sum of two number is:"+(a+b));


        sc.close();
        
    }
}
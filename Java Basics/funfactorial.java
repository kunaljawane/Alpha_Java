import java.util.Scanner;

public class funfactorial {
    public static void funfact(int a){

        int fact=1;

        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }

        System.out.print("The Factorial is:"+fact);


    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int a=sc.nextInt();

        funfact(a);



        sc.close();
    }
    
}

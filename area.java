import java.util.Scanner;

public class area {
    public static void main(String args[])
    {//to print product of two numbers

        Scanner sc=new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter Fist Number:");
        a=sc.nextInt();
        System.out.print("Enter Second Number:");
        b=sc.nextInt();

        c=a*b;

        System.out.println("The area is:"+c+" sq Unit");

        if(a==b){
            System.out.print("The shape is Square");
        }
        else{
            System.out.print("The shape is Reactagular");
        }
        
        sc.close();
    }
    
}

package Oracle;

import java.util.Scanner;

public class Gst {

    public static void generateBill(int a,int b, int c)
    {
        int total=5*a+10*b+2*c;
        int grandTotal=total+(18*total/100);
        System.out.println("---Bill---");
        System.out.println("Pencil-"+a+" "+5*a);
        System.out.println("Pen-   "+b+" "+10*b);
        System.out.println("Eraser-"+c+" "+2*c);
        System.out.println("-------------------");
        System.out.println("Total Bill is:"+grandTotal);
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numebr of pencils:");
        int a=sc.nextInt();
        System.out.println("Enter the numebr of pen:");
        int b=sc.nextInt();
        System.out.println("Enter the numebr of Earaser:");
        int c=sc.nextInt();

        generateBill(a,b,c);

        sc.close();

    }
    
}

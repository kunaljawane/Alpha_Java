import java.util.*;

import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
public class calc{
    public static  void  main(String args[]) {
        int a,b;
        char op;

        Scanner sc=new Scanner(System.in);


        System.out.print("Enter first number:");
        a=sc.nextInt();
        System.out.print("Enter second number:");
        b=sc.nextInt();
        System.out.print("Enter the operation:");
        op=sc.next().charAt(0);

        System.out.print("Result:");

        switch (op){
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '/':System.out.println(a/b);
                break;
            default:
                break;


        }

        sc.close();


                

        
    }
    
}
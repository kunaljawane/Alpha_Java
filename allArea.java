import java.util.*;
public class allArea {

    //in this program i am adding the fucntinality for user to selet the shape they want to find the area of 
    //then taking the required param as the input and showing the area

    public static void rec(){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of one side:");
        a=sc.nextInt();
        System.out.print("Enter the length of second side:");
        b=sc.nextInt();
        c=a*b;
        System.out.print("The area of the rectangle is:"+c);
        
        sc.close();
    }

    public static void square(){
        int a,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of one side:");
        a=sc.nextInt();
        
        c=a*a;
        System.out.print("The area of the square is:"+c);
        sc.close();
        
    }

    public static void circle(){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Redius of one circle:");
        a=sc.nextInt();
        
        double c=3.14*a*a;
        System.out.print("The area of the cicle is:"+c);
        sc.close();
        
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("--Menu--");
        System.out.println("1 For Square");
        System.out.println("2 For Rectangle");
        System.out.println("3 For circle\n");


        System.out.print("Enter choice:");
        int a=sc.nextInt();

        switch(a){
            case 1:
             square();
             break;
            case 2:
             rec();
             break;
            case 3:
             circle();
             break;
            default:
             break;
        }

        sc.close();
      }
    
}

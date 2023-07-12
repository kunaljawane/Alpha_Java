import java.util.*;
public class oddeven {
    public static void main(String args[]){
        //checking for odd even
        Scanner sc=new Scanner(System.in);

        int a;
        System.out.print("Enter any number:");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        //damm zero is even number
        sc.close();

    }


    
}

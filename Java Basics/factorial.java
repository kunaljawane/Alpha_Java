import java.util.*;

//finding the factorial

public class factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int fact=1;

        if(a>=0){

            for(int i=1;i<=a;i++){
                fact=fact*i;
                
            }

        }
        else{
            System.out.println("Sorry Factorial Not possible!!");
        }
        System.out.print("The value of Factorial is:");

        System.out.print(fact);



        sc.close();

        
    }
}
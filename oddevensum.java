import java.util.*;

public class oddevensum{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        //taking the range of number as input
        System.out.print("Enter Start:");
        int a=sc.nextInt();
        System.out.print("Enter End:");
        int b=sc.nextInt();

        int numcount=0;
        int sum=0;
        int sumodd=0;
        int oddcount=0;
        int sumeven=0;
        int evencout=0;

        //checkig for odd even


        for(int i=a;i<=b;i++)
        {
            numcount+=1;
            sum+=i;

            if(i%2==0){
                evencout+=1;
                sumeven+=i;
            }
            else{
                oddcount+=1;
                sumodd+=i;
            }

        }

        System.out.println("\nTotal numbers:"+numcount);
        System.out.println("Sum of total numbers:"+sum);
        System.out.println("\nTotal odd numbers:"+oddcount);
        System.out.println("Sum of odd numbers:"+sumodd);
        System.out.println("\nTotal even numbers:"+evencout);
        System.out.println("sum of even numbers:"+sumeven);



        sc.close();
        
    }
}
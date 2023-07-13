package Array;
import java.util.*;


public class Update {

    public static void print(int arr[]){

        int passcount=0;

        int failcount=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=35){
                System.out.println(i+1+"=Pass");
                passcount+=1;
            }
            else{
                System.out.println(i+1+"=Fail");
                failcount+=1;
            }
        }

        System.out.println("\nTotal Student:"+arr.length);
        System.out.println("Total Passed Student:"+passcount);
        System.out.println("Total Failled Student:"+failcount);


    }

    public static void main(String args[])
    {
        int n;

        System.out.print("Enter the number of Students:");

        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        int marks[]=new int[n];

        System.out.print("\nEnter the marks of "+n+" students:");

        for(int i=0;i<n;i++)
        {
            int m;
            System.out.println("\nStudent Number ["+i+1+"]:");
            m=sc.nextInt();
            marks[i]=m;
        }

        print(marks);

        sc.close();

    }
    
}

package Oracle;

import java.util.Scanner;

public class array1 {

    public static void main(String[] args) {

        int n;
        System.out.println("Enter number of students:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int marks[]=new int[n];

        for(int i=0;i<marks.length;i++)
        {
            marks[i]=100-i;
        }

        System.out.println("Marks are as Follows:");

        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        sc.close();


    }
    
}

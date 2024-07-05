package Oracle;

import java.util.*;

public class array3 {

    public static void min(int marks[])
    {
        int min=Integer.MAX_VALUE;

        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<min)
            {
                min=marks[i];
            }
        }

        System.out.println("The minimum marks is:"+min);

    }
    
    public static void max(int marks[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]>max)
            {
                max=marks[i];
            }
        }

        System.out.println("Maximum marks is:"+max);

    }

    public static void average(int marks[])
    {
        int n=marks.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
          sum=sum+marks[i];  
        }

        int avg=sum/n;

        System.out.println("The average value is:"+avg);

    }

    public static void redundant(int[] marks)
    {
        int count=0;
        for(int i=0;i<marks.length;i++)
        {
            int num=marks[i];
            int eachcount=0;
            for(int j=0;j<marks.length;j++)
            {
                if(num==marks[j])
                {
                    eachcount++;
                }
            }
            if(eachcount>count)
            {
                count=eachcount;
            }
        }

        for(int i=0;i<marks.length;i++)
        {
            int finalcount=0;
            int n =marks[i];
            for(int j=0;j<marks.length;j++)
            {
                if(marks[j]==n)
                {
                    finalcount++;
                }
            }
            if(finalcount==count)
            {
                System.out.println("The most Redundant value is:"+n+" Occurs "+count+" Times");
                break;
            }
            
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int marks[]=new int[n];

        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Enter marks of Student "+(i+1)+": ");
            marks[i]=sc.nextInt();
        }

        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        min(marks);
        max(marks);
        average(marks);
        redundant(marks);
        
        sc.close();
        
    }
    
}

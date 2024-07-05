package Oracle;

import java.util.Scanner;

public class twodarray1 {

    public static void print(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
               System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }

    }

    public static void min(int arr[][])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]<min){
                    min=arr[i][j];
                };
            }
        }

        System.out.println("Minimum value is:"+min);
    }

    public static void max(int arr[][])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("The maximum value is:"+max);
    }

    public static boolean isPresent(int arr[][],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.println("Element found! at Index:("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("OOpps, element not found!");
        return false;
    }

    public static void sum(int arr[][])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {

                sum+=(arr[i][j]);

            }
        }
        System.out.println("The sum of Element is:"+sum);

        int avg=sum/(arr.length*arr[0].length);

        System.out.println("The average of element is:"+avg);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array is:");
        print(arr);
        max(arr);
        min(arr);
        sum(arr);
        isPresent(arr, 7);
        sc.close();
    }


    
}

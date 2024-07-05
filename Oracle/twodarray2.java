package Oracle;

import java.util.Scanner;

public class twodarray2 {

    public static void diagonalSum(int[][] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for( int j=0;j<arr[0].length;j++)
            {
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }

        System.out.println("The diagonal sum is:"+sum);

        int sumI=0;
        for(int i=0;i<arr[0].length;i++)
        {
          sumI+=arr[i][arr[0].length-i-1];  
        } 

        System.out.println("The inverse sum is:"+sumI);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        } 
        sc.close();  
        System.out.println("The Array is:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }   
        
        diagonalSum(arr);
            
    }
    
}

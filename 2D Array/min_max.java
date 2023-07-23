import java.util.Scanner;

public class min_max {

    public static void min(int matrix[][])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[j][j];
                }
            }
        }
        System.out.println("The minimum element is:"+min);

    }

    public static void max(int matrix[][])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>max)
                {
                    max=matrix[i][j];
                }
            }
        }

        System.out.println("The maximum element is:"+max);

    }

     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[2][2];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                matrix[i][j]=sc.nextInt();

            }
        }

        System.out.println("The matrix you Enterd is:");

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }

        min(matrix);
        max(matrix);

        

        sc.close();

        

    }
    
}


//this program helps to find out the min max element from the matrix
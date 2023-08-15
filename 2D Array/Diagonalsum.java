import java.util.Scanner;

public class Diagonalsum {

    public static void sum(int matrix[][])
    {
        int sum1=0;
        int sum2=0;
        //for left diagonal i==j
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j)
                {
                    sum1+=matrix[i][j];
                }
            }
        }

        //for right diagonal i+j==matrix.length-1

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++)
            {
                if(i+j==matrix.length-1)
                {
                    sum2+=matrix[i][j];
                }
            }
        }

        System.out.println("The sum of Primary Diagonal element is:"+sum1);
        System.out.println("The sum of Primary Diagonal element is:"+sum2);

    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        System.out.println("Enter Matrix Element:");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix[i][j]=sc.nextInt();

            }
        }

        System.out.println("The matrix you Enterd is:");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }

        sum(matrix);
        sc.close();

    }
    
}

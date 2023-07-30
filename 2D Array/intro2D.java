import java.util.*;
public class intro2D {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];

        int n=3;//row
        int m=3;//column

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();

    }
    
}

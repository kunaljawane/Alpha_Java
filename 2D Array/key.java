import java.util.Scanner;

public class key {

    public static boolean print(int matrix[][],int key){

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Key is found at["+i+","+j+"] Position");

                    return true;
                    
                }
            }
        }
        System.out.println("Key not found");
        return false;


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

        print(matrix, 5);

        sc.close();

        

    }
    
}

//this program will help to find the position of the key
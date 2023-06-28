import java.util.Scanner;

public class invertedstar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numebr of stars:");
        int a=sc.nextInt();

        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a-i+1;j++)
            {
                System.out.print("*");
            }
                    System.out.println(" ");

        }

        sc.close();
    }
}
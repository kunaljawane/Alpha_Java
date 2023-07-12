import java.util.Scanner;

public class charpattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();

        char ch='A';

        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }

        sc.close();
    }
    
}

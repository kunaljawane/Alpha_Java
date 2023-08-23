import java.util.Scanner;

public class numpattern {
    public static void main(String args[]){ //args array of string type (args=command line argument)
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();

        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }


        sc.close();

    }
    
}

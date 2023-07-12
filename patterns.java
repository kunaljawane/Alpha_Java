import java.util.*;
public class patterns {

    // star pattern
    //here i have used two for loops one to keep track of numebr of line
    //other to keep track of stars in one line
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numebr of stars:");
        int a=sc.nextInt();

        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        sc.close();
    }
    
}

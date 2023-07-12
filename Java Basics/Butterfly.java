public class Butterfly {
    public static void print(int n){
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");

            }
            for(int p=1;p<=i;p++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");

            }
            for(int p=1;p<=i;p++)
            {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void main(String args[])
    {
        print(4);

    }
    
}

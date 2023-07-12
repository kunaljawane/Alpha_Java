public class Diamond {

    public static void print(int n){
        for(int i=1;i<=n;i=i+2)
        {
            for(int j=1;j<=(n-i-j);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=0;i=i-2)
        {
            for(int j=1;j<=n-i-j;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        print(5);
    }
    
}

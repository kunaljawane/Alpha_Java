package Oracle;

public class recSumOFN {

    public static void print(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("The sum is:"+sum);
    }

    public static int recprint(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int sum=n+recprint(n-1);

        return sum;
    }

    public static void main(String[] args) {
        int n=10;
        print(n);
        System.out.print("The recursion sum is:");
        System.out.println(recprint(n));
    }
    
}

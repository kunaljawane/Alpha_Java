package Problems;
public class Prime {

    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[])
    {
        int n=10;

        System.out.println(isPrime(n));

    }
    
}

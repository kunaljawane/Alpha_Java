package Oracle;
//factorial
public class recfact {

    public static int recFact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fact=n*recFact(n-1);
        return fact;
    }

    public static void fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Loop Factorial Method:"+fact);

    }

    public static void main(String[] args) {
        int n=4;
        fact(n);
        System.out.print("Recusion Factorial Method:");
        System.out.print(recFact(n));
    }
    
}

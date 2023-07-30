public class FactorialFun {

    public static long fact(int n)
    {
        long fact=1;

        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }

        return fact;
    }

    public static void main(String args[])
    {
        System.out.println(fact(45));
    }
    
}

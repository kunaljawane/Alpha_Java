package Problems;



public class Fibonacci {

    public static int fib(int n)
    {
        if(n==1||n==0)
        {
            return n;
        }   

        int fnm1=fib(n-1);
        int fnm2=fib(n-2);

        int fn=fnm1+fnm2;

        return fn;
        

    }

    public static void main(String args[])
    {
        System.out.println(fib(10));
    }
    
}

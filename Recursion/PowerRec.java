public class PowerRec {

    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int xm1=power(x, n-1);
        return x*xm1;
    }
    public static void main(String args[])
    {
        System.out.println(power(5,10));
        System.out.println(Math.pow((double)5, (double)10));
    }
    
}

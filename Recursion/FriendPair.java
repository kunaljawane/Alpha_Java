public class FriendPair {
    public static int pair(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }

        //single
        int nm1=pair(n-1);

        //double
        int nm2=pair(n-2);

        int pairWays=(n-1)*nm2;

        int totalway=nm1+pairWays;

        return totalway;

    }

    public static void main(String args[])
    {
        System.out.println(pair(5));
    }
    
}

package Problems;

public class FIb2 {

    public static void findFib(int n)
    {
        int[] res=new int[n];

        res[0]=1;
        res[1]=1;

        for(int i=2;i<n;i++)
        {
            res[i]=res[i-1]+res[i-2];
        }

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }

    public static void main(String args[])
    {
        findFib(7);
    }
    
}

public class Fibonacci{

    public static void print(int n)
    {
        int arr[]=new int[n];

        arr[0]=0;
        arr[1]=1;

        for(int i=2;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }

    //fib with recursion

    public static int fib(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }

        int fnm1=fib(n-1);
        int fnm2=fib(n-1);

        int fb=fnm1+fnm2;

        return fb;
    }

    public static void main(String args[])
    {
        print(10);
        System.out.println();
        System.out.println(fib(10));
    }

}

//fibonacci series is the series of numbers in which the number is the sum of two
//preceding numbers
//0,1,1,2,3,5...
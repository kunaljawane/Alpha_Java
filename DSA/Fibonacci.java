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

    public static void main(String args[])
    {
        print(11);
    }

}

//fibonacci series is the series of numbers in which the number is the sum of two
//preceding numbers
//0,1,1,2,3,5...
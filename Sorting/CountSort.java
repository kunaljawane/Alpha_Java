public class CountSort {

    public static void count(int arr[])
    {
        //find maximum
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }

        //declare the count array of n size
        int[] count=new int[max+1];

        //fill the count array
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++; //increase the count array for each element in arr
        }

        //fill the original arr with the sorted values

        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                count[i]--;
                j++;

            }
        }

    }

    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String args[])
    {
        int[] arr={6,3,1,5,9,2};
        count(arr);
        print(arr);
    }
    
}

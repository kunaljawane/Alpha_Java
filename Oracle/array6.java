package Oracle;
//print subarray

public class array6 {
    public static void print(int[] arr)
    {
        int n=arr.length;
        int maxsum=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+") ");
                if(arr[i]+arr[j]>maxsum)
                {
                    maxsum=arr[i]+arr[j];
                }
            }
        }
        System.out.println();
        System.out.println("Maximum sum is:"+maxsum);
    }

    public static void main(String[] args) {
        int arr[]={5,3,5,8,1,9,2,5,7,8,1};
        System.out.println();
        print(arr);
    }

    
    
}

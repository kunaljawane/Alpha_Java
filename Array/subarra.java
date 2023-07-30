package Array;

public class subarra {

    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6};

        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=i+1;j<arr.length;j++)
            {
                
                int count=0;
                System.out.print("[");
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    count+=arr[k];
                }
                System.out.println("]="+count);
                System.out.println();
            }
            
        }
        System.out.println();
    }
    
}

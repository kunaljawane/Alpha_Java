package Problems;
public class NextGreater {

    public static void nextG(int[] arr)
    {
        int[] res=new int[arr.length];

        int idx=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i])
                {
                    res[idx]=arr[j];
                    idx++;
                    break;

                }
            }
            if(res[i]==0)
            {
                res[i]=-1;
               
                
            }

        }





        for(int k=0;k<res.length;k++)
        {
            System.out.print(res[k]+" ");
        }

    }
    
    public static void main(String args[])
    {
        int[] find={10,4,1,6,2,1,3,7,2,5,9,1};

        nextG(find);

    }
}



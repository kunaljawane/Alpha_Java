import java.util.*;
public class SmallestPos{

    public static int  find(int arr[])
    {
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                return i+1; 
            }
        }

        return arr.length+1;

        
    }

    public static int SmallestPosforneg(int[] arr)
    {
        int smallest=1;
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                if(arr[i]!=smallest)
                {
                    return smallest;
                }
                smallest++;

            }

            
        }
        return arr.length;
    }

    public static void main(String args[])
    {
        int arr[]={1,2,4,5,-2,6};

        // System.out.println(find(arr));

        System.out.println(SmallestPosforneg(arr));
    }
}

//missing smallest positive
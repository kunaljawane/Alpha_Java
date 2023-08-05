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

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};

        System.out.println(find(arr));
    }
}
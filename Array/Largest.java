package Array;

// import java.util.*;

public class Largest {

    public static void main(String args[]){
        int arr[]={12,56,8,-1,10};

        int count=Integer.MIN_VALUE; //-infinity
        int s_count=Integer.MAX_VALUE; //+infiniy

        //Interger.MAX_VALUE
        //FOR USING THESE WE NEED TO IMPORT IT FROM UTIL PACKAGE

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>count)
            {
                count=arr[i];
            }
            if(arr[i]<s_count)
            {
                s_count=arr[i];
            }
        }

        System.out.println("The largest element is:"+count);
        System.out.println("The smallest element is:"+s_count);

    }
    
}

import java.util.*;

public class Inbuild_sort {
    
    public static void main(String args[])
    {
        int arr[]={4,3,2,1};

        Arrays.sort(arr);

        //if you want to sort the algo from Start_indx to end_indx--Arrays.sort(arr,start_index,end_index)

        //for sorting the algo in the descending alog then you have to import the collections
            //Arrays.sort(arr,Collections.reverseOrder())
            //for using this you need to declare datatype as Integer



        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}

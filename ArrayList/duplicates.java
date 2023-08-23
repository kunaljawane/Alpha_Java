package ArrayList;
import java.util.*;


public class duplicates {

    public static void remove(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }

        int n=list.size();

        int[] noDup=new int[n];
        int idx=0;
        for(int i=0;i<noDup.length;i++)
        {
            noDup[i]=list.get(idx);
            idx++;

        }

        for(int j=0;j<noDup.length;j++)
        {
            System.out.print(noDup[j]+" ");
        }

        

    }


    public static void main(String args[])
    {
        int[] arr={1,2,5,1,2,3,5,3};

        remove(arr);
    }
    
}

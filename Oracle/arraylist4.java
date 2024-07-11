package Oracle;

import java.util.ArrayList;

public class arraylist4 {

    public static void removeDuplicate(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            if(list.contains(arr[i])==false)
            {
                list.add(arr[i]);
            }
        }

        int[] res=new int[list.size()];

        for(int i=0;i<list.size();i++)
        {
            int ele=list.get(i);
            res[i]=ele;
        }

        System.out.print("After removing the duplicates:");
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,6};


        removeDuplicate(arr);

    }
    
}

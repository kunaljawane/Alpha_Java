package Oracle;
import java.util.*;

public class arraylist3 {

    public static boolean isduplicate(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            int ele=list.get(i);
            for(int j=i+1;j<list.size();j++)
            {
                if(ele==list.get(j))
                {
                    return true;
                }
            }


        }
        return false;

    }

    public static void removeDuplicate(ArrayList<Integer> list)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(list1.contains(list.get(i))==false)
            {
                list1.add(list.get(i));
            }
        }

        System.out.println("List after removing duplicate"+list1);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(4);
        System.out.println();
        System.out.println(list);
        System.out.println(isduplicate(list));
        removeDuplicate(list);
    }
    
}

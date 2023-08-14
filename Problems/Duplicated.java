package Problems;
import java.util.*;
public class Duplicated {

    public static ArrayList<Integer> fromArr(int[] arr)
    {
        ArrayList <Integer> list=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++)
        {
            int n=arr[i];
            if(!list.contains(n))
            {
                list.add(n);
            }
        }
        Collections.sort(list);

        System.out.println("Array has "+list.size()+" distinct charater");

        return list;

    }

    public static String fromStr(String s)
    {
        ArrayList<Character> list=new ArrayList<>();

        for(int i=0;i<s.length();i++)
        {
            if(!list.contains(s.charAt(i)))
            {
                list.add(s.charAt(i));
            }
        }

        StringBuilder sb=new StringBuilder("");

        int idx=0;
        while(idx<list.size())
        {
            sb.append(list.get(idx));
            idx++;
        }

        Collections.sort(list);

        System.out.println("String has "+list.size()+" distinct charater");

        return sb.toString();

    }

    public static void main(String args[])
    {
        int[] arr={1,4,2,3,4,5,6,1,2,3,4};

        System.out.println(fromArr(arr));
        

        String s="abahdcachacdf";
        System.out.println(fromStr(s));
        
    }
    
}

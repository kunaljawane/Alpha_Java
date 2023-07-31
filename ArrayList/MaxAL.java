package ArrayList;
import java.util.*;

public class MaxAL {

    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(4);
        list.add(7);
        list.add(1);
        list.add(10);

        int max=Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++)
        {
            int num=list.get(i);
            if(num>max)
            {
                max=num;
            }
        }
        System.out.println("The Highest number is:"+max);
    }
    
}


 
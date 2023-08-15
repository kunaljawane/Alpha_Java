package Problems;

import java.util.ArrayList;

public class Fib3 {

    public static ArrayList<Integer> fib(int n)
    { 
        ArrayList<Integer> list=new ArrayList<>();

        if(n==1)
        {
            list.add(1);
            return list;
        }

        list.add(1);
        list.add(1);

        int idx=1;
        int i=2;

        while(i!=n)
        {
            list.add(list.get(idx)+list.get(idx-1));
            i++;
            idx++;
        }

        return list;
    }

    public static void main(String args[])
    {
        System.out.println(fib(4));
    }
    
}

package ArrayList;

import java.util.ArrayList;

import java.util.Collections;

public class Sortring {

     public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(4);
        list.add(7);
        list.add(1);
        list.add(10);

       Collections.sort(list); //ascending order

       System.out.println(list);

       Collections.sort(list, Collections.reverseOrder(null));

       System.out.println(list);
    }
    

    
    
}

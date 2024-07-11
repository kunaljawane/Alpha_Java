package Oracle;
import java.util.*;

public class arraylist1 {


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,4);//add 4 at index 1 without replacing 
        System.out.println(list);

        //get element
        int element=list.get(2);
        System.out.println(element);

        //remove element
        list.remove(2);
        System.out.println(list);

        //contains
        System.out.println(list.contains(4));

        //set element
        list.set(2, 3);
        System.out.println(list);

        //size
        System.out.println(list.size());
        
    }
    
}

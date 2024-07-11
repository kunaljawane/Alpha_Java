package Oracle;
import java.util.*;

public class arraylist2 {

    public static void printRev(ArrayList<Integer> list)
    { 
        System.out.print("The reverse order is: ");
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }

    public static void min_max(ArrayList<Integer> list)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)<min){
                min=list.get(i);
            }
            if(list.get(i)>max){
                max=list.get(i);
            }
        }

        System.out.println("The max is:"+max);
        System.out.println("The min is:"+min);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(8);
        list.add(1);
        list.add(9);
        System.out.println();
        System.out.println(list);
        System.out.println();
        printRev(list);
        System.out.println();
        min_max(list);
        Collections.sort(list);
        System.out.println("The sorted list is:"+list);

    }    
}
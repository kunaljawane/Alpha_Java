package LinkedList;
import java.util.LinkedList;


public class InbuildLL {

    public static void main(String args[])
    { 
        LinkedList<Integer> list=new LinkedList<>();

        list.addFirst(1);
        list.addFirst(0);
        list.addLast(2);
        list.addLast(3);

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);


    }
    
}

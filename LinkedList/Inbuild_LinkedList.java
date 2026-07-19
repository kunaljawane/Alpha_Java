/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class LL
{
	public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        list.addFirst(1); //to add at first position
        list.addFirst(2);
        System.out.println(list);
        
        list.addLast(3); //to add at last position
        list.addLast(4);
        System.out.println(list);
        
        list.removeFirst(); // to romove from first position
        System.out.println(list);
        
        list.removeLast(); // to romove from first position
        System.out.println(list);
        
        list.add(1,6); // add at index add 6 at 1st index
        System.out.println(list);
        
        list.remove(1); // remove element of specific index
        System.out.println(list);
        
        System.out.println(list.size()); //print the size of list
        
        
        
	}
}
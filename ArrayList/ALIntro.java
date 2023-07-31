package ArrayList;
import java.util.*;

public class ALIntro {

    public static void main(String args[])
    {
        ArrayList<Integer> List=new ArrayList<>();  //decalre the array list of integer type
        // ArrayList<String> List2=new ArrayList<>(); //decalr the array list of string type
        // ArrayList<Boolean> List3=new ArrayList<>(); //decalre the array list of boolean type
        
        //adding into the arraylist
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(1, 9);


        //printing the arraylist
        System.out.println(List);

        //to get element
        int n=List.get(1);
        System.out.println(n);
        System.out.println(List.get(1));

        //to remove element
        List.remove(2);
        System.out.println(List);

        //set element at index
        List.set(0, 0); //o in set at index 0
        System.out.println(List);

        //contains
        System.out.println(List.contains(2));
        System.out.println(List.contains(11));

        //size of arraylist
        System.out.println(List.size());



    }
    
}

//Linear data structure in java
//it can be changed dynamically where in array we cant store
//cant store the primitive datatype directly 
// import java.util.*;

//hashmap is the DS that stores the data in key value pair

import java.util.HashMap;

class hash{

    public static void main(String args[])
    {
        HashMap<String,Integer> map=new HashMap<>();

        //To insert in the map
        map.put("India",120);
        map.put("China",150);
        map.put("USA",50);


        map.put("India",150);
        //if the key exist then it update the value on value
    
        System.out.println(map); //there is no specific order it can be print in jumbled order
         
        //check if contains
        if(map.containsKey("France"))
        {
            System.out.println("Present");
        }else{
            System.out.println("absent");
        }

        //to get value of key
        //if not contains it will give return
        System.out.println(map.get("India"));

        //iteration
        // for(Map.Entry<String,Integer> e : map.entrySet())
        // {
        //     System.out.println(e.getKey());
        //     System.out.println(e.getvalue());
        // }


        }
}
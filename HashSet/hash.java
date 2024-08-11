import java.util.HashSet;

class hash{
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        
        //Add in set
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(6); //set doesnt take duplicates
        System.out.println(set);

        //cotain in set
        System.out.println(set.contains(4));//return true or false

        //size of set
        System.out.println("Size of set:"+set.size());

        //remove from set
        set.remove(5);
        System.out.println(set);
        set.add(5);

    }
}
public class Compare {
    public static void main(String args[])
    {
        //if we declare the string and declare the same string with the new 
        //operator then it does not indicates that they are same it will create another space for it in memroy
        //so to avoid that we use the .equals operator

        String s1="kunal";
        String s2=new String("kunal");

        if(s1==s2) //==points to the memory locations
        {
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }

        if(s1.equals(s2)) //when we use .equals opeator we can treate them as equal
        {//it check for actual equality word by word
            System.out.println("They are equal");

        }
        else{
            System.out.println("They are not equal");
        }
        
    }
    
}

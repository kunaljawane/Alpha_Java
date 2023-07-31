public class LexicoCompare {

    public static void main(String args[])

    //lexicographically- alphabetically order
    {
        String str[]={"mango","zanana","apple"};

      

        String Largest=str[0];

        for(int i=0;i<str.length;i++)
        {
            if(Largest.compareTo(str[i])<0) //largest is smaller
            {
                Largest=str[i];
            }
        }



        System.out.print(Largest);
    }
    
}

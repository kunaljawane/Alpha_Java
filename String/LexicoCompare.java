import java.util.Arrays;

public class LexicoCompare {

    public static void main(String args[])

    //lexicographically- alphabetically order
    {
        String str[]={"mango","zanana","apple","Apple"};

      

        String Largest=str[0];

        for(int i=0;i<str.length;i++)
        {
            if(Largest.compareTo(str[i])<0) //largest is smaller
            {
                Largest=str[i];
            }
        }

        Arrays.sort(str);

        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }


        



        //System.out.print(Largest);
    }
    
}

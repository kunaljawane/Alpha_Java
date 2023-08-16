public class Compression {

    public static void main(String args[])
    {
        String str="aabbccc";

        String result="";

        
        // for(int i=0;i<str.length();i++)
        // {
        //     Integer count=1;

        //     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
        //     {
        //         count+=1;
        //         i++;
        //     }

        //     result+=str.charAt(i);
        //     if(count>1)
        //     {
        //         result+=count.toString();
        //     }
        // }


        for(int i=0;i<str.length();i++)
        {
            int count=1;

            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }

            result+=str.charAt(i);
            if(count>1)
            {
                result+=count;
            }
        }

        System.out.print(result);
    }
    
}

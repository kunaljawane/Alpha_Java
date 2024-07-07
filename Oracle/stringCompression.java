package Oracle;

public class stringCompression {

    public static void compress(String s)
    {
        String s1="";

        for(int i=0;i<s.length();i++)
        {
            Integer count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                count++;
                i++;
            }
            s1+=s.charAt(i);
            if(count>1)
            {
                s1+=count.toString();
            }

        }
        System.out.println(s1);
        

    }

    public static void main(String[] args) {
        String s="aaabbccc";
        compress(s);
    }
    
}

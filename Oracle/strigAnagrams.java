package Oracle;

import java.util.Arrays;

public class strigAnagrams {

    public static boolean isAnagram(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2)
        {
            return false;
        }
        char[] s1arr=new char[n1];
        char[] s2arr=new char[n2];

        for(int i=0;i<s1.length();i++)
        {
            s1arr[i]=s1.charAt(i);
        }
        for(int j=0;j<s2.length();j++)
        {
            s2arr[j]=s2.charAt(j);
        }

        Arrays.sort(s1arr);
        Arrays.sort(s2arr);

        for(int i=0;i<s1arr.length;i++)
        {
            if(s1arr[i]!=s2arr[i])
            {
                return false;
            }
        }

        return true;
        

    }

    public static void main(String[] args) {
        String s1="abcdefg";
        String s2="gfedcbw";
        System.out.println(isAnagram(s1,s2));
    }
    
}

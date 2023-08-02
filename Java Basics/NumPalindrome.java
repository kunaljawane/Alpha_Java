public class NumPalindrome {

    public static boolean isPalindrome(int n)
    {
        String str=String.valueOf(n);

        int len=str.length();

        for(int i=0;i<len/2;i++)
        {
            if(str.charAt(i)!=str.charAt(len-i-1))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(String s)
    {
        int len=s.length();
        
        for(int i=0;i<len/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len-i-1))
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[])
    {
        int n=345543;
        String str="madam";

        System.out.println(isPalindrome(n));
        System.out.println(isPalindrome(str));

    }
    
}

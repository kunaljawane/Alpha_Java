public class ContainDuplicate {
    public static boolean contain(String s,int idx){

       for(int i=idx;i<s.length();i++)
       {
        for(int j=i+1;j<s.length();j++)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                return true;
            }
        }
        
       }



        return false;
    }

    public static void main(String args[])
    {
        System.out.println(contain("kunal", 0));

    }
    
}

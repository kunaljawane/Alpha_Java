public class prac1 {


    public static void print(String str){
        int lowCount=0;
        int upCount=0;

        for(int i=0;i<str.length();i++)
        {
            int ch=str.charAt(i);

            if(Character.isLowerCase(ch))
            {
                lowCount+=1;

            }else{
                if(ch!=' '){
                    upCount+=1;
                }
            }
        }

        System.out.println("Lowercase:"+lowCount);
        System.out.println("Uppercase:"+upCount);
    }

    public static void main(String args[])
    {
        String str="This Is Kunal";
        print(str);

    }

    
    
}

//give the number of uppercase and lowercase character


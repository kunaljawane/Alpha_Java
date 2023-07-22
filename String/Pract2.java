public class Pract2 {

    public static void print(String str)
    {
        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)) && str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count+=1;
                System.out.print(str.charAt(i)+" ");
            }
        }

        System.out.println("\nTotal lower case vowels:"+count);
    }

    public static void main(String args[])
    {
        String str="Hey there this is mickey mouse";

        print(str);
    }
    
}


//write the code to return the count of lowercase vowels


public class substring {

    public static String print(String str,int start,int end){

        String substr="";

        for(int i=start;i<end;i++)
        {
            substr+=str.charAt(i);
        }

        return substr;

    }

    public static void main(String args[])
    {
        //substring is the part of any string 
        String str="HEyThisIsMe";
        System.out.println(print(str,0,5));

        //also we can print it with the inbuild function
        System.out.println(str.substring(0, 5));

    }
    
}

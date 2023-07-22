import java.util.Arrays;

class pract3 {
  public static void main(String args[])
  {
    String str1="race";
    String str2="care";

    if(str1.length()==str2.length()){
        String strA=str1.toLowerCase(null);
        String strB=str2.toLowerCase(null);

        char[] str1Array=strA.toCharArray();
        char[] str2Array=strB.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        if(Arrays.equals(str1Array, str2Array))
        {
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }



    }
    else{
        System.out.print("no");

    }
  }
}
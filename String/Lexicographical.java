//Lexicographically - alphabetical 
import java.util.*;

public class Main {
    
    public static String largest(String[] str){
        
        String lrgst = str[0];
        
        for(int i=0;i<str.length;i++){
            if(lrgst.compareTo(str[i])<0){
                lrgst=str[i];
            }
        }
        
        return lrgst;
    }
    
    public static String smallest(String[] str){
        
        String smlst = str[0];
        for(int i=0;i<str.length;i++){
            if(smlst.compareTo(str[i])>0){
                smlst=str[i];
            }
        }
        return smlst;
    }
    
   
    public static void main(String[] args) {
       
      String[] str = {"kunal","dudu","bubu","sakshi"};
      
      System.out.println(largest(str));
      
      System.out.println(smallest(str));
    }
}

/*
Return value	Meaning
Negative (< 0)	string1 comes before string2
Zero (== 0)	Both strings are equal
Positive (> 0)	string1 comes after string2
*/

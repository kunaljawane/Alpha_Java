package Oracle;
import java.util.*;

public class array5 {

    public static Boolean binarySearch(int[] marks,int key)
    {
      Arrays.sort(marks);
      int start=0;
      int end=marks.length-1;
      
      while(start<=end)
      {
        int mid=(start+end)/2;

        if(marks[mid]==key)
        {
            return true;
        }
        if(marks[mid]<key)
        {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
      }

      return false;
            
    
    }

    public static void main(String[] args) {

        int marks[]={1,2,3,4,5,67,7,8,9};
        int n=9;
        System.out.println();
        System.out.println(binarySearch(marks,n));
        
    }
    
}

package Oracle;

public class array4 {

    public static boolean LinearSearch(int[] marks,int n)
    {
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==n)
            {
                return true;
            }
        }
        return false;
    }

    public static Boolean binarySearch(int[] marks,int key)
    {
      int start=0;
      int end=marks.length-1;
      int mid=(start+end)/2;
      
      while(start<=end)
      {
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
        int n=6;
        System.out.println();
        System.out.println(binarySearch(marks,n));
        
    }
    
}

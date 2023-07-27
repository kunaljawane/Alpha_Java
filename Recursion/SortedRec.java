public class SortedRec {

    public static boolean check(int arr[],int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;

        }

        return check(arr, i+1);


    }

    public static void main(String args[])
    {
        int marks[]={1,2,3,4};

        System.out.println(check(marks, 0));
    }
    
}

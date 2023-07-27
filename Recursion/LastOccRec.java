public class LastOccRec {
    public static int print(int arr[],int key,int length){
        if(length==0)
        {
            return -1;
        }

        if(arr[length-1]==key)
        {
            return length-1;
        }

        return print(arr, key, length-1);

    }

    public static void main(String args[])
    {
        int marks[]={1,2,3,4,1,2,3,5,6,1,2};

        System.out.println(print(marks, 1,11));
    }
    
}

public class FirstoccRec {
    public static int print(int  arr[],int key,int i)
    {
        if(i==arr.length)
        {
            
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }

        return print(arr, key, i+1);

        
        
       
    }
    public static void main(String args[])
    {
        int marks[]={1,2,3,4};

        System.out.println(print(marks, 5,0));

    }
    
}

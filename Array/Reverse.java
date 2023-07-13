package Array;

public class Reverse {

    public static void print(int arr[])
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+"->");
        }

    }

    public static void main(String args[]){

        int marks[]={45,13,2,43,23};

        
        print(marks);
    }
    
}

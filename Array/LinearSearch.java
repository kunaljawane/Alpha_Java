package Array;

public class LinearSearch {

    public static void print(int arr[],int key){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key){
                System.out.println("The key is at Index:"+i);
                
            }
            
        }
    }

    public static void main(String args[])
    {
        int arr[]={6,7,4,2};
        int n=2;
        print(arr,n);
    }
    
}
//time complextiy==o(n) for n element

public class Bubble_sort {

    public static void Bubble(int arr[]){

        for(int i=0;i<arr.length-1;i++) 
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void print(int arr[]){

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String args[])
    {
        int arr[]={5,4,3,2,1};

        Bubble(arr);

        print(arr);
    }
    
}

// bubble sort is the sorting technique in which the element is exploerd one by one
// and greater element is pushed to the end
// firstly the element is compared with the next element and then pushed forward
// Time complexity=O(n square)




public class Selection_sort {
    public static void selection(int arr[]){

        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }

            }

            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
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
        int arr[]={12,14,11,15};

        selection(arr);

        print(arr);
    }
}

// in the slection sort we use idea opposite to bubble sort insted of swapping one by one
// we directly find for the smallest element and bring that element at the start and one 
// by one we get the sorted array
// time complextiy is O(n square)
public class QuickSort {
    
    public static void quickS(int arr[],int si,int ei)
    {
        //base case
        if(si>=ei)
        {
            return;
        }

    
        int pindex=pidx(arr,si,ei);

        quickS(arr, si, pindex-1); //for left part
        quickS(arr, pindex+1, ei); //for right part



    }

    public static int pidx(int arr[],int si,int ei)
    {
        int pivot=arr[ei];

        int i=si-1;

        for(int j=si;j<ei;j++)
        {
            if(arr[j]<pivot)
            {
                i++;

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Add a space to separate the printed elements
        }
    }

    public static void main(String args[])
    {
       
            int arr[] = { 1, 2, 5, 3, 8, 4 };
    
            quickS(arr, 0, arr.length - 1);
    
            print(arr);
        

    }
    
}

//work on the pivot and partition method 
//pivot is the element around which thing are revolving
//if the pivot element is alway smallest or largest then we will get its worst case time complextiy as O(nsquare)
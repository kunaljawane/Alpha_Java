public class InsertionSort{
    public static void sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i]; //int curr=second element 
            int prev=i-1; //in pre=first element

            while(prev>=0 && arr[prev]>curr) //previous in greater than current
            {
                arr[prev+1]=arr[prev];
                prev--;
            }

            arr[prev+1]=curr;
        }

    }

    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String args[])
    {
        int arr[]={5,7,1,2};

        sort(arr);
        print(arr);
    }
}

//in this sorting algo we find the desired position for the element and then put the element at that place
//like we do while arranging the playing cards


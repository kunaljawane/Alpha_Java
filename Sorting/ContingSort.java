public class ContingSort {

    public static void sort(int arr[])
   {

        //for finding the largest
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++; //increse the value in count array for arr[i];

        }

        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }

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


//it is used for the array with the small range
//in this you have to made another array named as count which can store the frequency of the element
//Time complextiy O(n+k) where n=total number of element and k=range of element

//this sorting is the non-comparision based sorting

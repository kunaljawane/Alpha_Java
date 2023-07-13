package Array;

public class BInary_search {

    //binary search requires the sorted array
    //in this technque we devide the array is shorter array 

    //first we need start and end and from it we find the mid and then complare the key with the mid 
    //is key is smaller then find in rhs and if key is greater then find in the Lhs



    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,8,10};

        int key=5;

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                System.out.print("Index:"+mid);
            }
            if(arr[mid]>key)//left
            {
                end=mid-1;
            }
            else{//right
                start=mid+1;
            }

        }
    } 
    
}

//Time complexity is O(logn)


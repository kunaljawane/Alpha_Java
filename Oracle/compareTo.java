package Oracle;

//lexicographical order=alphabetical order

public class compareTo {

    public static void printLargest(String arr[])
    {
        String largest="";

        for(int i=0;i<arr.length;i++)
        {
            if(largest.compareTo(arr[i])<0){
                largest=arr[i];
            }
        }

        System.out.println("The largest String is:"+largest);
    }

    public static void main(String[] args) {
        String arr[]={"mango","apple","orange","zebra"};

        printLargest(arr);

    }
    
}

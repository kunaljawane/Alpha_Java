package Array;

public class SubArray {
    //part of array that contain continious element

    public static void main(String args[]){
        int count[]={2,4,6,8,10};


        for(int i=0;i<count.length;i++)
        {
            System.out.println(count[i]+" "+"="+count[i]+"  ");

            for(int j=i+1;j<count.length;j++)
            {
                int counter=0;
                
                for(int k=i;k<=j;k++)
                {
                    System.out.print(count[k]+",");
                    counter+=count[k];
                }
                System.out.print("="+counter+"  ");
                System.out.println("  ");
                
            }
            System.out.println();
        }


    }
    
}

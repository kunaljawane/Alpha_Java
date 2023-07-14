package Array;

public class Max_sum {

    public static void main(String args[]){
        int count[]={1,-2,6,-1,3};
        int max_sum=Integer.MIN_VALUE; //-infintiy
        int min_sum=Integer.MAX_VALUE; //+infinity

        for(int i=0;i<count.length;i++)
        {

            for(int j=i;j<count.length;j++)
            {
                int counter=0;
                
                for(int k=i;k<=j;k++)
                {
                    System.out.print(count[k]+",");
                    counter+=count[k];
                }
                System.out.print("="+counter+"  ");
                if(counter>max_sum)
                {
                    max_sum=counter;
                }
                if(counter<min_sum)
                {
                    min_sum=counter;
                }
                System.out.println("  ");
                
            }


            System.out.println();
        }

        System.out.println("The maximum sum is:"+max_sum);
        System.out.println("\nThe minimum sum is:"+min_sum);


    }
    
}

//Time complexity is n ki power 3

//this is brute force apporoach--checking the all possible outcomes
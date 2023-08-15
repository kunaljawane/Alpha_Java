package Array;
public class PairsInArray {

    public static void main(String args[]){

        int pairs[]={1,2,3,4,5,6};
        
        int count=0;


        for(int i=0;i<pairs.length;i++)
        {
            for(int j=0;j<pairs.length;j++)
            {
                System.out.print("["+pairs[i]+","+pairs[j]+"] ");
                count+=1;
            }
            System.out.println();
        }

        System.out.println("Total Pairs:"+count);
         
    }
    
}

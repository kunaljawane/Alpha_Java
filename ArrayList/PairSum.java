package ArrayList;

import java.util.ArrayList;

public class PairSum {

    public static boolean isPair(ArrayList<Integer> height,int k)
    {
        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                if(height.get(i)+height.get(j)==k)
                {
                    System.out.println(height.get(i));
                    System.out.println(height.get(j));
                    return true;
                }
            }
        }

        return false;

    }



    public static void main(String args[])
    {
        ArrayList<Integer> height=new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(8);
        height.add(3);
        height.add(7);

        int k=12;

        System.out.println(isPair(height,k));



    }
    
    
}

//it two element in the arraylist gives the target sum then it will return true otherwise false
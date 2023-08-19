package ArrayList;
import java.util.*;
public class ContainerWithMostWater {

    public static int print(ArrayList<Integer> height){
        int maxWater=0;

        for(int i=0;i<height.size();i++)
        {
            for(int j=i+1;j<height.size();j++)
            {
                int ht=Math.min(height.get(i),height.get(j));//find height
                int wd=j-i; //find width
                int area=ht*wd; //calculate area
                maxWater=Math.max(maxWater,area);

                

            }
        }

        return maxWater;

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

        System.out.println(print(height));



    }
    
}

//this is brute force approach with time complexity as O(n square)

//in this approach we check for every possible pair that can hold water and calculate the maximum water that one can hold and return it
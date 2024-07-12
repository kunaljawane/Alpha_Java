package Oracle;

import java.util.ArrayList;

//lonely number-in frequency in one then it said to be lonely number
public class arraylist5 {

    public static ArrayList<Integer> lonelyList(ArrayList<Integer> list)
    {
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=0;i<list.size();i++)
        {
            int ele=list.get(i);
            int count=0;
            for(int j=0;j<list.size();j++)
            {
                if(list.get(j)==ele)
                {
                    count++;
                }
            }
            if(count==1)
            {
                res.add(list.get(i));
            }

        }

        return res;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);
        System.out.println();

        System.out.println(lonelyList(list));
    }
    
}

public class Tiling {

    public static int  tiling(int n){

        if(n==1||n==0)
        {
            return 1;
        }

        int nm1=tiling(n-1);
        int nm2=tiling(n-2);

        return nm1+nm2;
        

    }

    public static void main(String args[])
    {
        int n=4;

        System.out.println(tiling(n));
    }

    
}

//given the 2*n floor and tile of size 2*1 find the number of way to tile the given floor with tiles
//tile either can be placed horizontally or vertically 
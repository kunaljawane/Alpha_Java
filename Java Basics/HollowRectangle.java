public class HollowRectangle {

    public static void print(int row,int column){
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++)
            {
                if(i==1 || i==row || j==1||j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        print(10, 10);

    }
    
}

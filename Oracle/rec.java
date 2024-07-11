package Oracle;
public class rec {
//decreasing order

    public static void printDEC(int n)
    {
        if(n==0)
        {
            return;
        }
        
        System.out.print(n+" ");
        printDEC(n-1);
        

    }

    public static void printINC(int n)
    {
        if(n==0)
        {
            return;
        }
        printINC(n-1);
        
        System.out.print(n+" ");        

    }
    public static void main(String[] args) {
        int n=10;
        // printDEC(n);
        printINC(n);
        
    }
    
}

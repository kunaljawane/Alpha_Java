import java.util.Scanner;

public class binomialCoefficient {

     public static void BinCoef(int n,int r){

        int nfact=1;
        int rfact=1;
        int subfact=1;

        for(int i=1;i<=n;i++)
        {
            nfact=nfact*i;
        }

        for(int i=1;i<=r;i++)
        {
            rfact=rfact*i;
        }

        int sub=n-r;

        for(int i=1;i<=sub;i++)
        {
            subfact=subfact*i;
        }

        int result=(nfact)/(rfact*subfact);

        System.out.println("The result of Binomial Expression is:"+result);

       


    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int n=sc.nextInt();
        System.out.print("\nEnter The Number:");
        int r=sc.nextInt();

        
        BinCoef(n, r);


        sc.close();
    }
    
    
}

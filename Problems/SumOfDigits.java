package Problems;

public class SumOfDigits {

    public static int findsum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }

        return sum;

    }

    public static void main(String args[])
    {
        System.out.println(findsum(761));
    }

    
}

//This code will return the sum of digits in the given number

public class Binary{

    public static void convert(int binnum){
        int num=binnum;

        int dec=0;
        int pow=0;

        while(binnum>0)
        {
            int lastdigit=binnum%10;

            dec=dec+(lastdigit*(int)Math.pow(lastdigit, pow));
            pow++;
        }



        System.out.println("The decimal of number "+num+" is:"+dec);

    }

    public static void main(String args[])
    {
        System.out.println("This is main");
        convert(101);

    }
}
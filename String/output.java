import java.util.Scanner;

public class output {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String str=sc.next(); //this will only take the one word as the input

        String str2=sc.nextLine(); //this will take the whole line as the input

        System.out.println(str);
        System.out.println(str2);

        //for taking the length of string

        System.out.print(str.length());

        //in string .length() is the function so we need the parnthesis where is the array it is property so we need to specify without parnthesis

        

        sc.close();
    }
    
}

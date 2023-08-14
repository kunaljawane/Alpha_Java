import java.util.*;
public class StackJCF {
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s);

        s.pop();

        System.out.println(s);

        int n=s.peek();

        System.out.println(n);

    }
    
}

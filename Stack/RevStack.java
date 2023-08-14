import java.util.*;
public class RevStack {

    public static void pushAtBottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);


    }

    public static Stack<Integer> Reverse(Stack<Integer> s)
    { 
        Stack<Integer> res=new Stack<>();

        while(!s.isEmpty())
        {
            int n=s.pop();
            res.push(n);
        }

        return res;

    }
    //using recursion

    public static void revRec(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        revRec(s);
        pushAtBottom(s, top);

        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }

    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        System.out.println(Reverse(s));
        revRec(s);
    }
    
}

//In this method I have created the another stack and stored the element in the reverse order
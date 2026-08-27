import java.util.*;

//Push given element in the bottom of stack -- Solved using Reccursion 

//This class also has function to reverse the stack using pushAtBottom

class StackPushAtBottom{

    public static void PushBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
       int top = s.pop();
       PushBottom(data,s);
       s.push(top);

    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        PushBottom(top, s);
    }


    public static void main(String[] args) {
        System.out.println("Stack push at bottom using Recursion");

        Stack<Integer> s = new Stack<>();
       

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        //PushBottom(9,s);

        //This will print the revered stack 
        while(!s.isEmpty()){
           System.out.println(s.peek());
           s.pop();
        }
    }
}
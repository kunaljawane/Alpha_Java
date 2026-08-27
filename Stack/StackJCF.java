import java.util.*;

class StackJCF{


    public static void main(String[] args) {
        System.out.println("Stack implementation using Java Collection Framework");

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
           System.out.println(s.peek());
           s.pop();
        }
    }
}
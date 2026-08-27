
import java.util.Stack;

//reverse the stack usign another stack

class ReverseStack{

    public static Stack<Integer> reverseStack(Stack<Integer> s){
        Stack<Integer> reverse = new Stack<>();
        while(!s.isEmpty()){
            int element = s.pop();
            reverse.push(element);
        }
        return reverse;
    }

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Reversed");
        System.out.println(reverseStack(s));

    }
}
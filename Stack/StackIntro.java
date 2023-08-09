import java.util.ArrayList;
public class StackIntro {

    public static class Stack{
        static ArrayList<Integer> stack=new ArrayList<>();

        //isEmpty
        public static boolean isEmpty()
        {
            return stack.size()==0;
        }

        //push
        public static void push(int data)
        {
            stack.add(data);
        }

        //pop
        public static int pop()
        {
            int top=stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }

        //peek
        public static int peek()
        {
            return stack.get(stack.size()-1);
        }

    }

    public static void main(String args[])
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }


    }
    
}

// operations:
// push-plac element
// pop-remove element
// peek-find the topmost
// LIFO-last in first out

// stack can be implemented using the array, arraylist and linkedlist
// but as we know array has fixed length so we use arraylist and linkedlist

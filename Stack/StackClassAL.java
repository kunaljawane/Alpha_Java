
import java.util.ArrayList;


//stack implementation using ArrayList

public class StackClassAL{
    

    public static void push(int data,ArrayList<Integer> list){
        list.add(data);
   }

   public static int pop(ArrayList<Integer> list){
    int top = list.get(0);
    list.remove(0);
    return top;

   }

   public static int peek(ArrayList<Integer> list){
    int top = list.get(0);
    System.out.println("Returning peek elemeent with peek....\nyour peek element is");
    return top;
   }

    void printStack(ArrayList<Integer> list){
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
    System.out.println("Printed Stack");
   }

        
        
    

    public static void main(String args[]){
        System.out.println("Stack implementation using ArrayList with dudu");    
        
        ArrayList<Integer> list = new ArrayList<>();


        StackClassAL stack = new StackClassAL();

        stack.printStack(list);

        stack.push(1,list);
        stack.push(2,list);
        stack.push(3,list);
        stack.push(4,list);
        stack.push(5,list);

        stack.printStack(list);

        stack.pop(list);
        stack.printStack(list);
        
        System.out.println(stack.peek(list));
        
    }
}



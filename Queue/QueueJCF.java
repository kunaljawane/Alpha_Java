import java.util.LinkedList;
import java.util.Queue;

class queueJCF{
    public static void main(String[] args) {
        
        //here queue is a interface implemented by linkedlist and dequeu 
       // Queue<Integer> q = new LinkedList<>();

        Queue<Integer> q = new LinkedList<>();

      //  Queue<Integer> q = new ArrayDeque<>(); //this will get use double ended queue


        q.add(1);
        q.add(2);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
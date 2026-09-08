
/*

Queue is the data structure where we can add element in FIFO manner
first in first out

Enque - add - adding in queue
Dequequ - Remove - removing from the queue 
front - peek - getting first element of queue 

Implementation using array
 */

class Queue{

    class QueueI{

        static int arr[];
        static int size;
        static int rear=-1;

        QueueI(int n) {
            this.size=n;
            arr = new int[n];
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static boolean isFull(){
            if(rear==size-1){
                return true;
            }
            return false;
        }

        //enque - O(1)
        public static void add(int ele){
            if(QueueI.isFull()==true){
                System.out.println("Queue is already full!!");
                return;
            }
            rear++;
            arr[rear]=ele;

        }

        //deque -- O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty!!");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peak - O(n)
        public static int peak(){
            if(isEmpty()){
                System.out.println("Queue Empty!!");
                return -1;
            }
            return arr[0];
            
        }

        
    }

    public static void main(String[] args){
        System.out.println("Here queue");
        Queue q = new Queue();
        Queue.QueueI queue = q.new QueueI(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.remove();
        while(!queue.isEmpty()){
            System.out.println(queue.peak());
            queue.remove();
        }
    }
}
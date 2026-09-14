/*
when we normally implements queue using array remoove and peek needs O(n) Time 
while when we implement circular queue using array all operations done in O(1) Time  
 */

class CircularQueue{

    static class Queue{
         int[] arr;
         int front=-1;
         int rear=-1;
         int size;

        public Queue(int n) {
            arr = new int[n];
            this.size=n;
        }

        public  boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public  boolean isFull(){
            return (rear+1)%size==front;
        }

        public  void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            //for 1st element increment 1st index 
            if(front==-1){
                front=0; 
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }

        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int first= arr[front];
            //if single element is queue
            if(front==rear){
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }

            return first;
        }
        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int first= arr[front];
            return first;
        }

        

    }

    public static void main(String[] args) {
        
      Queue q = new Queue(10);

      q.add(10);
      q.add(8);
      q.add(6);

      q.remove();

      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }

    }
}
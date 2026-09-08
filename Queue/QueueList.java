
class QueueList{

    static class Node{
         int data;
         Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class List{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        //enqueu
        public static void add(int data){
            Node newNode = new Node(data);

            if(tail==null){
                head = tail= newNode;
                return;
            }

            tail.next=newNode;
            tail=newNode;
        }

        //dequeu
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
           if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }

            int front = head.data;

            // Only one element
            if (head == tail) {
                head = tail = null;
                return front;
            }

            head = head.next;

            return front;
        }

        //peak

        public static int peak(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {

        List q = new List();
        System.out.println("here list queue");
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(7);

        while(!q.isEmpty()){
            System.out.println(q.peak());
            q.remove();
        }


        
    }
}
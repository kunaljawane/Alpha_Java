package Oracle;

public class LL_Doubly {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }

       

        
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void removeFist()
    {
        if(head==null)
        {
            return;
        }
        if(size==1)
        {
            head=tail=null;
            size--;
            return;
        }

        head=head.next;
        head.prev=null;
        size--;
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        size++;
    }

    public void removeLast()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next.prev=null;
        temp.next=null;
        size--;
    }

    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Size:"+size);
    }




    public static void main(String[] args) {

        LL_Doubly list = new LL_Doubly();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(5);
        System.out.println();

        list.print();

        list.removeLast();
        list.print();
        list.removeLast();
        list.print();

    }

}

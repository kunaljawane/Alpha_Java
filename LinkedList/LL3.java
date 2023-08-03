package LinkedList;

public class LL3 {

    public class Node{

        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static Node head;
    public static Node tail;
    public int size;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    
    //function to add at any index 
    public void add(int idx,int data)
    {
        //create the node
        Node newNode=new Node(data);
        size++;

        //create temp for tracking index

        Node temp=head;
        int i=0;

        //increase temp and index while we get the previous node of where we want to insert
        while(i<idx-1)
        {
            temp=temp.next;
            i++;

        }
        
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
        

    }

    public static void main(String args[])
    {
        LL3 list=new LL3();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.print();
        list.add(2, 9);
        list.print();
        System.out.println(list.size);
        //for adding at the given index

    }

    
    
}

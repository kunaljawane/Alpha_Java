package LinkedList;

public class LLPrac {

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

    public void addFirst(int data)
    {
        
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int idx,int data)
    {
        Node newNode=new Node(data);
        
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }

    public static void main(String args[])
    {
        LLPrac list=new LLPrac();

        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        
        list.add(4, 5);
        print();

    }

    
}


//The best usecase of the link list is forward and backward button in the in chrome tab for shifting the tabs

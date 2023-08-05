package LinkedList;

public class LLpalindrom {

    public class Node{
        int data;
        Node next;

        public Node(int data)
        {
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
            return;
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
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }

    }

    public static void main(String args[])
    {
        LLpalindrom list=new LLpalindrom();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(2);
        list.addLast(1);
        list.print();
        
    }
    
}

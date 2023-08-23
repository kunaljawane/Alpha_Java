package LinkedList;

public class OracleLL {

    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addF(int data)
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
        if(head==null){
            head=tail=null;
        }
        tail.next=newNode;
        newNode=tail;
    }

    public void print()
    {
        if(head==null)
        {
            return;
        }
        Node temp=head;

        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;

        }

        
    }

    public static void main(String args[])
    {

    }
    
}

package LinkedList;

public class LinkedList2 {

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
           
        //step1- create the new node 
        Node newNode=new Node(data);

        if(head==null)
            {
                head=tail=newNode;
                return;
            }

            //step2- add newNode->next as head (link the new node with the head)
        newNode.next=head;

            //step 3- make head as newNode
        head=newNode;
    }

    public void addLast(int data)
    {
        
        //create the new node
        Node newNode=new Node(data);

        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        //tails next as newNode
        tail.next=newNode;

        //make newnode next as null
        tail=newNode;



    }

    public void print()
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
        LinkedList2 ll=new LinkedList2();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();

    }
    
}

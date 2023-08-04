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

    public int removeFirst()
    {
        if(size==0)
        {
            return -1;
        }
        if(size==1)
        {
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;

        size--;

        return val;

        
    }

    public int removeLast()
    {
        if(size==0)
        {
            return -1;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }

        //for deleting the tail you have to find the node previous to the tail (i=size-2)
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }

    public int search(int n)
    {
        Node temp=head;

        // for(int i=0;i<size;i++)
        // {
        //     if(temp.data==n)
        //     {
        //         return i;
        //     }
        //     temp=temp.next;
        // }


        int i=0;
        while(temp!=null)
        {
            if(temp.data==n)
            {
                return i;
            }
            i++;
            temp=temp.next;
        }

        return -1;
    }

    public void reverse()
    {
        //for this we require the three pointers prev curr and next
        Node prev=null;
        Node curr=tail=head; //for reversing now our tail had become the head
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public int findSize()
    {
        int sz=0;
        Node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            sz++;
        }

        return sz;
    }

    public void removeFromEnd(int n)
    {
        //if want to remove head
        if(n==size)
        {
            head=head.next;
            return;
        }

        int i=1;
        int idx=size-n; //index of node previous to node we want to delete
        Node prev=head;
        while(i<idx)
        {
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return;
    }

    public static void main(String args[])
    {
        LL3 list=new LL3();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(8);
        list.addLast(6);

        // //for adding at the given index
        // list.print();
        // list.add(2, 9);
        // list.print();
        // System.out.println(list.size);
        

        //for removing the first element
        // list.print();
        // list.removeFirst();
        // System.out.println();
        // list.print();


        // //this code will remove the last node
        // list.print();
        // list.removeLast();
        // System.out.println();
        // list.print();
        // list.removeLast();
        // System.out.println();
        // list.print();


        //for searching
        // list.print();
        // System.out.println();
        // System.out.println(list.search(6));

        //for reversing 
        // list.print();
        // list.reverse();
        // System.out.println();
        // list.print();


        //To find the size of the linked list
        // list.print();
        // System.out.println();
        // System.out.println(list.findSize());

        //To remove from the end
        // list.print();
        // list.removeFromEnd(3);
        // System.out.println();
        // list.print();

        

    }

    
    
}

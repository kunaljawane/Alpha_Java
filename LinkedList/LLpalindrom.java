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

    //for finding the middle with the slow fast approach

    public Node middle(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public boolean isPalindrome()
    {
        if(head==null || head.next==null)
        {
            //if the linked list in null or have only one element
            return true;
        }
        //step1-find the mid
        Node midNode=middle(head);

        //step2-reverse the second half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;  //right half ka head
        Node left=head;  //left half ka head

        while(right!=null)
        {
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;


        //step2-compare first half and second half


    }


    

    public static void main(String args[])
    {
        LLpalindrom list=new LLpalindrom();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(2);
        list.addLast(2);
        
        list.print();

        System.out.println();
        System.out.println(list.isPalindrome());
   
        
    }
    
}

//to check for the palindrom of linked list you can add LL element in the array or arraylist or string and then check for the palindrome of same

// Steps:
// 1-find the middle element
// 2-then reverse the secode half
// 3-check if the first half is equal to the second half


// for finding the mid here we use the slow fast approach or turtle hare approach
// initially both the pointerns were on head and then slow moves by 1 step and fast by 2 Steps
// in even case:
// if the size of LinkedList in even then when fast in on tail slow will be on mid because its 
// move is half of the fast
// in odd case:
// if the fast in on previous to tail(null-1) the slow will be on mid
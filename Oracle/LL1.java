package Oracle;
import java.util.*;

class LL1{

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
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public void add(int idx,int data)
    {
        if(idx==0)
        {
            addFirst(data);
        }
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

    public void size()
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            temp=temp.next;
            i++;
        }
        System.out.println("Size:"+i);
    }

    public void removefirst()
    {
        head=head.next;
    }

    public void removeLast()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }

    public void search(int n)
    {
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==n)
            {
                System.out.println("Found...at index:"+i);
                return;
            }
            i++;
            temp=temp.next;
        }

        System.out.println("Sorry..Element not found");

    }

    public void remove(int idx)
    {
        int i=0;
        if(idx==0)
        {
            removefirst();
            return;
        }
        Node temp=head;
        while(i<idx-1)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
    }

    public void isPalindrome()
    {
        ArrayList<Integer> list=new ArrayList<>();

        Node temp=head;
        while(temp!=null)
        {
            list.add(temp.data);
            temp=temp.next;
        }

        for(int i=0;i<list.size()/2;i++)
        {
            if(list.get(i)!=list.get(list.size()-i-1))
            {
                System.out.println("Not A Palindrome");
                return;
            }
        }

        System.out.println("Yes list is Palindrome");



    }

    public void cycle()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                System.out.println("Cycle detected");
                return;
            }
        }

        System.out.println("Cycle Not detected!!");
    }
    
    public void removeCycle()
    {
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                cycle=true;
                break;
                }
        }

        if(cycle==false)
        {
            System.out.println("Cycle not found!!");
            return;
        }

        slow=head;
        Node prev=null;
        while(slow!=fast)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        prev.next=null;
        System.out.println("Removed!!");

    }
    public static void main(String[] args) {

        LL1 list=new LL1();
        // list.addFirst(4);
        // list.addFirst(3);
        // list.addFirst(3);
        // list.addFirst(4);
        // list.add(0, 1);
        // list.addLast(1);
        // list.addLast(1);
        head =list.new Node(1);
        Node temp=list.new Node(5);
        head.next= temp;
        head.next.next=list.new Node(6);
        head.next.next.next=temp;

        list.cycle();
        
        System.out.println();
        list.removeCycle();
        list.print();

    }

}
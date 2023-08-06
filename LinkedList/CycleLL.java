package LinkedList;

public class CycleLL {

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


    public static boolean isCycle()
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;

    }

    public static void removeCycle()
    {   
        //detect cycle
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
                break; //cycle detected
            }
        }
        if(cycle=false)
        {
            return;
        }

        //find the meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast)
        {
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //whenever the loop ends then prev will point to node before the meeting point;

        //remove cycle
        prev.next=null;





    }

    public static void main(String args[])
    {
        
        
    }
    


    
}

//cycle in the linked list-if any one node of the linkedList if points to the to
//previous node then it forms the cycle and goes in the infinite loop 
//To find that cycle we use the Floyd cycle finding alogrithm
//In this algo we uses the smae slow fast aaproach if the linked list if forming the cyclle
//tHEN at cetail point of cyccle the slow==fast which is not possible in singley linked list 
//so at that time we make cycle condition true



//For removing the cycle
// if the fast and slow meet at the point then which means the cycle exists then we 
// bring the slow to head again and start increasing slow as welll as fast by one 
// so wheneverr the will meet again that node will be the node after the end of linked list 
// so from that we will make the end of linked list as null and cycle will be removed
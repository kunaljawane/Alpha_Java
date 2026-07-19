
public class LL
{
	public class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data=data;
			next=null;
		}
	}

	public Node head;
	public Node tail;

	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}

		newNode.next=head;
		head=newNode;

	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}

		Node currNode = head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	
	public void deleteFirst(){
	    if(head==null) {
    		System.out.println("List is empty!!");
	    	return;
		}
		head=head.next;
	}
	
	public void deleteLast(){
	    if(head==null) {
    		System.out.println("List is empty!!");
	    	return;
		}
		Node currNode=head;
		while(currNode.next.next!=null){
		    currNode=currNode.next;
		}
		currNode.next=null;
		
	}

	public void printList() {
		if(head==null) {
			System.out.println("List is empty!!");
			return;
		}
		Node currNode = head;
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println("null");
	}

    public int listSize(){
        if(head==null){
            return 0;
        }
        Node currNode = head;
        int size=1;
        while(currNode.next!=null){
            size++;
            currNode=currNode.next;
        }
        return size;
    }
    
    public boolean detectCycle(){
        if(head==null){
            return false;
        }
        
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           
            if(slow==fast){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return false;
    }
    
    public void createCycle(String targetData) {
    if (head == null) {
        return;
    }

    Node targetNode = null;
    Node currNode = head;

    while (currNode.next != null) {
        if (currNode.data.equals(targetData)) {
            targetNode = currNode;
        }
        currNode = currNode.next;
    }

    // Check the last node too
    if (currNode.data.equals(targetData)) {
        targetNode = currNode;
    }

    if (targetNode == null) {
        System.out.println("Target node not found");
        return;
    }

    // Last node points back to the target node
    currNode.next = targetNode;
}

	public static void main(String[] args) {
    
    LL list = new LL();
        
    list.addLast("1");
    list.addLast("2");
    list.addLast("3");
    list.addLast("4");
    list.addLast("5");
    
    /*
        1 -> 2 -> 3 -> 4 -> 5
                  ^         |
                  |_________|
    */

    list.createCycle("3");

    System.out.println(list.detectCycle());
	}
}
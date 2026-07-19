
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
	
	// ReverseList with extra space 
	// Iterate on list and call addFirst for each node 
	public  LL reverseList(){
	    LL revList = new LL();
	    if(head==null){
	        System.out.println("List is empty");
	        return revList;
	    }
	    Node currNode = head;
	    while(currNode!=null){
	        revList.addFirst(currNode.data);
	        currNode=currNode.next;
	    }
	    return revList;
	}
	
	//Intertive reverse without extra space
	public void itertiveReverse(){
	    if(head==null || head.next==null){
	        System.out.println("Already reversed!!");
	        return;
	    }
	    
	    Node prevNode = head;
	    Node currNode = head.next;
	    while(currNode!=null){
	        Node nextNode = currNode.next;
	        currNode.next=prevNode; //reverse
	        
	        //Move forward
	        prevNode = currNode;
	        currNode = nextNode;
	    }
	    head.next=null;
	    head=prevNode;
	    
	}
	
	public void addAtIndex(int idx,String data){
	   
	   int counter=0;
	   Node currNode=head;
	   Node newNode =new Node(data);
	   if(idx==0){
	       newNode.next=head;
	       head=newNode;
	       return;
	   }
	   while(currNode!=null){
	       Node nextNode=currNode.next;
	       if(counter==idx-1){
	           currNode.next=newNode;
	           newNode.next=nextNode;
	           return;
	       }
	       
	       currNode=currNode.next;
	       counter++;
	   }
	}
	
	public void removeAtIndex(int idx){
	    int counter=0;
	    Node currNode = head;
	    
	    while(currNode!=null){
	        if(counter==idx-1){
	            Node nodeToremove = currNode.next;
	            currNode.next=nodeToremove.next;
	            nodeToremove.next=null;
	            return;
	        }
	        counter++;
	        currNode=currNode.next;
	    }
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

	public static void main(String[] args) {
        LL list = new LL();
       
        list.addFirst("1");
        list.addLast("2");
        list.addFirst("3");
        list.addFirst("4");
        list.addLast("2");
        list.addLast("4");
        list.printList();
        
        list.addAtIndex(2,"6");
        list.printList();
        
        list.removeAtIndex(2);
        list.printList();       
        
        
	}
}

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

	public static void main(String[] args) {
        LL list = new LL();
        list.printList();
        list.addFirst("1");
        list.printList();
        list.addLast("2");
        list.printList();
        list.addFirst("3");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.addFirst("4");
        list.printList();
        list.deleteLast();
        list.printList();
	}
}
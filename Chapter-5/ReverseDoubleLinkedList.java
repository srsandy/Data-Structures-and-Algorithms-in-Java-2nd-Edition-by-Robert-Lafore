/*
    Solved By: vanshbhasin157 (https://github.com/vanshbhasin157)
    Modified By: Sandeep Ranjan (1641012352)
*/

class Node { 

	int data; 
	Node next, prev; 

	Node(int data) { 
		this.data = data; 
		next = prev = null; 
	} 
}  

class DLL { 

	private Node head; 

	public DLL() {
		head = null;
	}

	void reverse() { 
		Node temp = null; 
		Node current = head; 

		while (current != null) 
		{ 
			temp = current.prev; 
			current.prev = current.next; 
			current.next = temp; 
			current = current.prev; 
		} 

		if (temp != null) { 
			head = temp.prev; 
		} 
	} 

	public void insert(int data) { 
		
		Node new_node = new Node(data); 
		new_node.next = head; 
	
		if (head != null) { 
			head.prev = new_node; 
		} 

		head = new_node; 
	} 

	void printList() { 
		Node p = head;
		while (p != null) { 
			System.out.print(p.data + " "); 
			p = p.next; 
		} 
	}
}

class ReverseDoubleLinkedList {

	public static void main(String[] args) { 
		DLL list = new DLL(); 

		
		list.insert(2); 
		list.insert(4); 
		list.insert(8); 
		list.insert(10); 

		System.out.println("Original linked list "); 
		list.printList(); 

		list.reverse(); 
		System.out.println(""); 
		System.out.println("The reversed Linked List is "); 
		list.printList(); 
	}
}

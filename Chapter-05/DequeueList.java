/*
    Solved By: Sandeep Ranjan (1641012352)
    
    Solution for Programming Project
    5.2
*/
class Node {
	int data;
	Node fLink;
	Node bLink;

	Node(int data) {
		this.data = data;
		this.fLink = this.bLink = null;
	}
}

class DoubleLinklist {
	private Node start;
	private Node end;

	DoubleLinklist() {
		this.start = this.end = null;
	}

	public void insertBeg(int data) {
		Node newNode = new Node(data);

		if(start == null) {
			start = newNode;
			end = newNode;
		} else {
			start.bLink = newNode;
			newNode.fLink = start;
			start = newNode;
		}
	}

	public void insetEnd(int data) {
		Node newNode = new Node(data);

		if(start == null) {
			start = newNode;
			end = newNode;
		} else {
			end.fLink = newNode;
			newNode.bLink = end;
			end = newNode;
		}
	}

	public void deleteBeg() {
		if(start == null) {
			System.out.println("List Empty");
		} else if(start == end) {
			start = end = null;
		} else {
			Node temp = start;
			start = start.fLink;
			start.bLink = null;
			temp.fLink = null;
		}
	}

	public void deleteEnd() {
		if(start == null) {
			System.out.println("List Empty");
		} else if(start == end) {
			start = end = null;
		} else {
			Node temp = end;
			end = end.bLink;
			end.fLink = null;
			temp.bLink = null;
		}
	}

	public void display() {
		Node n = start;
		if(start != null) {
			while(n.fLink != null) {
				System.out.print(n.data + " -> ");
				n = n.fLink;
			}
			System.out.print(n.data + " ");
			System.out.println();
		} else {
			System.out.println("List Empty");	
		}
	}
}

class DeQueue {
	DoubleLinklist dll;

	public DeQueue() {
		dll = new DoubleLinklist();
	}

	public void insertFront(int data) {
		dll.insertBeg(data);
	}

	public void insertRear(int data) {
		dll.insetEnd(data);
	}

	public void deleteFront() {
		dll.deleteBeg();
	}

	public void deleteRear() {
		dll.deleteEnd();
	}

	public void display() {
		dll.display();
	}
}

class DequeueList {
	public static void main(String[] args) {
		DeQueue dq = new DeQueue();

		dq.insertFront(10);
		dq.insertFront(20);
		dq.insertRear(5);
		dq.display(); // 20 -> 10 -> 5


		dq.deleteFront();
		dq.deleteFront();
		dq.deleteFront();
		dq.display(); // List Empty

		dq.insertRear(5);
		dq.insertRear(15);
		dq.insertRear(25);
		dq.display(); // 5 -> 15 -> 25

		dq.deleteRear();
		dq.deleteRear();
		dq.deleteRear();
		dq.display(); // List Empty
	}
}
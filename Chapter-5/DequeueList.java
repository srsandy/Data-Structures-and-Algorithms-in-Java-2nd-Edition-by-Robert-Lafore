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

	doubleLinklist() {
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
		} else {
			Node temp = end;
			end = end.bLink;
			end.bLink = null;
			temp.bLink = null;
		}
	}

	public void display() {
		Node n = start;
		while(n.fLink != null) {
			System.out.print(n.data + " -> ");
			n = n.fLink;
		}
		System.out.print(n.data + " ");
	}
}

class DeQueue {
	DoubleLinklist dll;

	public DeQueue() {
		dll = new DoubleLinklist();
	}
}

class DequeueList {
	public static void main(String[] args) {
		
	}
}
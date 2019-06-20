/*
    Solved By: Sandeep Ranjan (1641012352)
    
    Solution for Programming Project
    5.4
*/

class Node {
	int data;
	Node link;

	Node(int data) {
		this.data = data;
		this.link = null;
	}
}

class CircularLinklist {
	private Node current;

	public CircularLinklist() {
		current = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);

		if(current == null) {
			newNode.link = newNode;
			current = newNode;
		} else {
			newNode.link = current.link;
			current.link = newNode;
			current = newNode;
		}
	}

	public void delete() {
		Node p = current;

		if(p.link == current) {
			current = null;
		} else {
			do {
				p = p.link;
			} while(p.link != current);

			p.link = current.link;
			current = p;
		}
	}

	public void display() {
		Node p = current;

		if(current != null) {
			do {
				p = p.link;

				System.out.print(p.data +  " ");
			} while(p != current);
			System.out.println();
		} else {
			System.out.println("List Empty");
		}
	}
}

class Stack {
	private CircularLinklist cll;
	private int size;
	private int ele;

	public Stack(int size) {
		cll = new CircularLinklist();
		this.size = size;
		this.ele = -1;
	}

	public void insert(int data) {
		if(isFull()) {
			System.out.println("Stack Full");
		} else {
			cll.insert(data);	
			ele++;
		}
	}

	public void delete() {
		if(isEmpty()) {
			System.out.println("Stack Empty");
		} else {
			cll.delete();	
			ele--;
		}
	}

	private boolean isFull() {
		return ele == (size-1);
	}

	private boolean isEmpty() {
		return ele == -1;
	} 

	public void display() {
		if(isEmpty()) {
			System.out.println("Stack Empty");
		} else {
			cll.display();	
		}
	}
}

class StackList {
	public static void main(String[] args) {
		Stack theStack = new Stack(5);

		theStack.insert(10);
		theStack.insert(20);
		theStack.insert(30);
		theStack.insert(40);
		theStack.insert(50);

		theStack.display();

		theStack.delete();
		theStack.insert(60);

		theStack.display();
	}
}
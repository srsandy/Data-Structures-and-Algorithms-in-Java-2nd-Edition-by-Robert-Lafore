/*
    Solved By: Sandeep Ranjan (1641012352)
    
    Solution for Programming Project
    5.3
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

	public void find(int data) {
		boolean found = false;

		Node p = current;

		do {
			p = p.link;
			if( data == p.data) {
				found = true;
				break;
			}
		}while(p != current);

		if(found) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
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

class CircularList {
	public static void main(String[] args) {
		CircularLinklist cll = new CircularLinklist();

		cll.insert(10);
		cll.insert(20);
		cll.insert(30);

		cll.display();

		cll.delete();
		cll.delete();
		cll.delete();
		cll.display();
	}
}

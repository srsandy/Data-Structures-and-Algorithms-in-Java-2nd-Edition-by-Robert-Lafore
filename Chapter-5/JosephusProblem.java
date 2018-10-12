/*
    Solved By: Sandeep Ranjan (1641012352)
    
    Solution for Programming Project
    5.5
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

	public void move() {
      if (!isEmpty()) {
        current = current.link;
      }
    }

    public boolean isEmpty() {
      return current == null;
    }
}

class JosephusProblem {

	public static void main(String[] args) {
		
		final int PEOPLE = 7;
    	final int COUNT = 4;
    	final int FIRST = 1;

    	CircularLinklist cll = new CircularLinklist();

    	// Insert People to CircularLinklist
    	for (int i = 1; i <= PEOPLE ; i++) {
      		cll.insert(i);
    	}

    	// Suicide Sequence
    	while (!cll.isEmpty()) {
      		cll.display();
      		for (int i = 1; i <= COUNT; i++) {
        		cll.move();
      		}
      		cll.delete();
    	}
	}
}

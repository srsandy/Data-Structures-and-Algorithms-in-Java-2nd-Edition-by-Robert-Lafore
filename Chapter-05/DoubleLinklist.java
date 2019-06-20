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
	private int length;

	DoubleLinklist() {
		this.start = null;
		this.length = 0;
	}

	public void insertBeg(int data) {
		Node newNode = new Node(data);

		if(start == null) {
			start = newNode;
		} else {
			start.bLink = newNode;
			newNode.fLink = start;
			start = newNode;
		}

		length++;
	}

	public void insetEnd(int data) {
		Node newNode = new Node(data);

		if(start == null) {
			start = newNode;
		} else {
			Node n = start;

			while(n.fLink != null) {
				n = n.fLink;
			}
		
			n.fLink = newNode;
			newNode.bLink = n;
		}

		length++;
	}

	public void insetPos(int data, int pos) {
		if(pos == 1) {
			insertBeg(data);
		} else if(pos > length ) {
			insetEnd(data);
		} else {

			int i=1;
			Node n = start;
			
			while( n.fLink != null ) {
				i++;
				if( i == pos) break;
				n = n.fLink;
			}

			Node newNode = new Node(data);

			newNode.bLink = n;
			newNode.fLink = n.fLink;
			n.fLink.bLink = newNode;
			n.fLink = newNode;

			length++;

		}
	}

	public void deleteBeg() {
		if(start == null) {
			System.out.println("list empty");
		} else {
			start = n.fLink;
			start.bLink = null;
		}

		length--;
	}
	
	public void deletePos(int pos) {
		if(pos < 0) {
			System.out.println("Pos does not");
			return;
		}
		if(pos == 1)  {
			deleteBeg();
		} else if( pos > length) {
			deleteEnd();
		} else {
			int i=1;
			Node p = start;
			
			while( p.fLink != null ) {
				i++;
				if( i == pos) break;
				p = p.fLink;
			}

			p.fLink.fLink.bLink = p;
			p.fLink = p.fLink.fLink;
			length--;
		}
	}

	public void deleteEnd() {
		if(start == null) {
			System.out.println("list empty");
		} else {
			Node n = start;

			while(n.fLink.fLink != null) {
				n = n.fLink;
			}

			n.fLink.bLink = null;
			n.fLink = null;
			length--;
		}
	}


	public void displayForward() {
		Node n = start;
		while(n.fLink != null) {
			System.out.print(n.data + " -> ");
			n = n.fLink;
		}
		System.out.print(n.data + " ");
	}

	public void displayBackward() {
		Node n = start;
		while(n.fLink != null) {
			n = n.fLink;
		}

		while(n.bLink != null) {
			System.out.print(n.data + " <- ");
			n = n.bLink;
		}
		System.out.print(n.data + " ");
	}

	public static void main(String[] args) {
		doubleLinklist dl = new doubleLinklist();

		dl.insertBeg(10);
		dl.insertBeg(20);
		dl.insertBeg(30);
		dl.insetEnd(40);

		dl.insetPos(2,4);

		dl.displayForward(); // 30 -> 20 -> 10 -> 2 -> 40
		System.out.println();

		dl.deleteEnd();
		dl.deleteBeg();

		dl.displayForward(); // 20 -> 10 -> 2
		System.out.println();

		dl.displayBackward(); // 2 <- 10 <- 20
	}
}

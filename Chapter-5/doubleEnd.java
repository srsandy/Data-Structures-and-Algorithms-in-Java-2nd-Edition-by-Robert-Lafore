class Node {
	int data;
	Node link;

	public Node(int data) {
		this.data = data;
		this.link = null;
	}

	public int getData() {
		return data;
	}
}

class DoubleEnded {
	private Node start;
	private Node end;
	private int length;

	DoubleEnded() {
		start = end = null;
		length = 0;
	}

	public void insertBeg(int data) {
		Node newNode = new Node(data);

		if(start == null) {
			start = newNode;
			end = newNode;
		}else {
			newNode.link = start;
			start = newNode;
		}

		length++;
	}

	public void insertEnd(int data) {
		Node newNode = new Node(data);

		if(start == null) {
			start = newNode;
		}else {
			Node n = end;
			
			end.link = newNode;
			end = newNode;
		}

		length++;
	}

	public void insetPos(int data, int pos) {
		if(pos < 0) {
			System.out.println("Pos does not");
			return;
		}

		if(pos == 1)  {
			insertBeg(data);
		} else if( pos > length) {
			insertEnd(data);
		} else {
			int i=1;
			Node n = start;
			
			while( n.link != null ) {
				i++;
				if( i == pos) break;
				n = n.link;
			}

			Node newNode = new Node(data);
			newNode.link = n.link;
			n.link = newNode;

			length++;
		}
	}

	public void deleteBeg() {
		if(start == null) {
			System.out.println("linkedlist Empty");
		} else {
			start = start.link;
			length--;
		}
	}

	public void deleteEnd() {
		if(start == null) {
			System.out.println("linkedlist Empty");
		} else {
			Node n = start;

			while(n.link.link != null) {
				n = n.link;
			}
		
			n.link = null;
			end = n;
			length--;
		}
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
			Node n = start;
			
			while( n.link != null ) {
				i++;
				if( i == pos) break;
				n = n.link;
			}

			n.link = n.link.link;
			length--;
		}
	}

	public void display() {
		Node n = start;

		while(n != null) {
			System.out.print(n.data + " ");
			n = n.link;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DoubleEnded dl = new DoubleEnded();

		dl.insertBeg(10);
		dl.insertBeg(20);
		dl.insertBeg(30);
		dl.insertEnd(40);
		dl.display();
		dl.deleteEnd();
		// dl.insetPos(60,5);
		// dl.insetPos(5,5);

		dl.display();
		// dl.deleteBeg();
		// dl.display();
		// dl.deleteEnd();
		// dl.display();
		// dl.deletePos(2);
		// dl.display();



	}

}
class CirQueue {
  	private
		int max,rear,front;
		int[] a;
	
  	public
		CirQueue(int m) {
		  max = m;
		  a = new int[m];
		  rear = front = -1;
		}
	
	void insert(int val) {
		if(isFull()) {
			System.out.println("overflow");
		} else {
			if(isEmpty()) {
				front = rear = 0;
				a[rear] = val;
			} else {
				rear = (rear+1)%max;
				a[rear] = val;
			}
	  	}
	}
	
	void display() {
		int i;
		for(i=front; i!=rear; i=(i+1)%max) {
			System.out.print(a[i] + " ");
		}
		System.out.print(a[i] + " ");
		System.out.println();
	}

	boolean isFull() {
		if(front == (rear+1)%max) return true;
		else return false;
	}

	boolean isEmpty() {
		if(rear == -1)  return true;
		else return false;
	}

	int delete() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return -1;
		} else {

			int temp = a[front];
			front = (front+1)%max;
			return temp;
		}
	}
}

class CircularQueue {
	public static void main(String[] agrs) {
		CirQueue q = new CirQueue(5);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.insert(60);
		q.display();

		q.delete();
		q.delete();
		q.delete();
		q.insert(60);
		q.insert(70);
		q.insert(80);
		q.delete();
		q.display();

	}
}

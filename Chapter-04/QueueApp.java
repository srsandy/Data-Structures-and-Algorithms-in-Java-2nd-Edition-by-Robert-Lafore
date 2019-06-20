class Queue {
  	private
		int max,rear,front;
		int[] a;
	
  	public
		Queue(int m) {
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
			  		rear++;
			  		a[rear] = val;
				}
			}
		}
	
		void display() {
	  		for(int i=front; i<=rear; i++) {
	    		System.out.print(a[i] + " ");
	  		}
	  		System.out.println();
		}

		boolean isFull() {
			if(rear == max -1) return true;
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
				if(rear==front) {
   					rear = -1;
   					front = -1;
   				} else {
   					front++;	
   				}
				return temp;
			}
		}
}

class QueueApp {
  public static void main(String[] agrs) {
		Queue q = new Queue(10);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.insert(50);
		q.insert(60);
		q.display();

		q.delete();
		q.display();
	}
}
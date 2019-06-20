/*
	Solved By: Sandeep Ranjan (1641012352)
	
	Solution for Programming Project
	4.3
*/

class DeQueue {
	private
		int max,rear,front;
		int[] a;
	
  	public
		DeQueue (int m) {
			max = m;
			a = new int[m];
			rear = front = -1;
		}
	
		void insertRear(int val) {
			if(isFullRear()) {
				System.out.println("overflow Rear");
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

		void insertFront(int val) {
			if(isFullFront()) {
				System.out.println("overflow Front");
			} else {
				if(isEmpty()) {
				  	front = rear = 0;
				  	a[front] = val;
				} else {
			  		front--;
			  		a[front] = val;
				}
			}
		} 
	
		void display() {
			for(int i=front; i<=rear; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}

		boolean isFullRear() {
			if(rear == max -1) return true;
			else return false;
		}

		boolean isFullFront() {
			if(front == 0) return true;
			else return false;
		}

		boolean isEmpty() {
			if(rear == -1 && front == -1)  return true;
			else return false;
		}

		int deleteFront() {
			if(isEmpty()) {
				System.out.println("Underflow Front");
				return -1;
			} else {
				int temp = a[front];
				front++;
				return temp;
			}
		}

		int deleteRear() {
			if(isEmpty()) {
				System.out.println("Underflow Rear");
				return -1;
			} else {
				int temp = a[rear];
				rear--;
				return temp;
			}
		}
}

class DeQueueApp {
  public static void main(String[] agrs) {
		DeQueue q = new DeQueue(5);
		q.insertFront(10);
		q.insertRear(20);
		q.insertRear(30);
		q.insertRear(40);
		q.insertRear(50);
		q.insertRear(60);

		q.deleteFront();
		q.deleteFront();

		q.deleteRear();
		q.deleteFront();

		q.insertFront(10);
		q.insertFront(20);
		q.insertFront(80);
		q.insertFront(70);
		q.insertRear(60);
		q.display();

	}
}

Project 4.3

class StackY {
	private DeQueue dequeStack;
	
	public StackY(int maxSize) {	
		dequeStack = new DeQueue(maxSize);
	}
	
	public void push(int val) {
		dequeStack.insertRear(val);
	}
	
	public int pop() {
		return dequeStack.deleteRear();
	}

	public void display() {
		dequeStack.display();
	}
	
}

class StackYApp {
	public static void main(String[] args) {
		StackY theStackY = new StackY(5);
		theStackY.push(10);
		theStackY.push(20);
		theStackY.push(30);
		theStackY.pop();
		theStackY.display();
	}
}

--------------------------
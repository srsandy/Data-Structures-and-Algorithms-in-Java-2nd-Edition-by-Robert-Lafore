/*
	Solved By: Sandeep Ranjan (1641012352)
	
	Solution for Programming Project
	4.2
*/

class CirDeque {
	private	int max,rear,front, nEle;
	private int[] a;
	
  	public CirDeque (int m) {
		max = m;
		a = new int[m];
		rear = front = -1;
		nEle = 0;
	}

	public boolean isFull() {
        return ((front == 0 && rear == max-1)|| front == rear+1);
    }

    public boolean isEmpty () {
        return (front == -1);
    }

    public void insertFront(int val) {
        if (isFull()) {
            System.out.println("Overflow as queue is Full"); 
        } else {

	        if (rear == -1) {
	            front = rear = 0;
	        } else if (front == 0) {
	            front = max - 1;
	        }
	        else {
	            front--;
	        }
	        a[front] = val;
	        nEle++;
	    }
    }

    public void insertRear(int val) {
        if (isFull()) {
            System.out.println("Overflow as queue is Full"); 
        } else {  

	        if (front == -1) {
	            front = 0;
	            rear = 0;
	        } else if (rear == max-1) {
	        	rear = 0;
	        } else {
	            rear++;
	        }

	        a[rear] = val;
	        nEle++;
    	}
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        } else {
	        if (front == rear) {
	            front = rear = -1;
	        } else {
	            if (front == max -1) {
	                front = 0;
	            } else {
	                front++;
	            }
	        }
	        nEle--;
    	}
    }

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return ;
        } else {

        	if (front == rear) {
            	front = -1;
            	rear = -1;
        	} else if (rear == 0) {
            	rear = max-1;
        	} else {
            	rear = rear-1;
        	}

        	nEle--;
        }
    }
  
    public void display() {
    	int j = front;
		
		for(int i=0; i<nEle; i++) {
				System.out.print(a[j] + " ");
				j++;

				if(j == max) {
					j = 0;
				}
		}

		System.out.println();
	}
	
}

class CircularDeque {
	public static void main(String[] args) {
		CirDeque cD = new CirDeque(5);

		cD.insertFront(10);
		cD.insertFront(20);
		cD.insertFront(30);
		cD.display();
		cD.insertRear(40);
		cD.display();
		cD.deleteRear();

		cD.deleteFront();

		cD.display();
	}
}
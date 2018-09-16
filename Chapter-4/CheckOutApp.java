/*
	Solved By: Sandeep Ranjan (1641012352)
	
	Solution for Programming Project
	4.5
*/

import java.util.Scanner;
import java.util.Random;

class CirQueue {
  	private
		int max,rear,front;
		int[] a;
		int size;
	
  	public
		CirQueue(int m) {
		  max = m;
		  size = 0;
		  a = new int[m];
		  rear = front = -1;
		}
	
		void insert(int val) {
			if(isFull()) {
				System.out.println("CUSTOMER CANNOT BE ADDED AS QUEUE IS FULL");
			} else {
				if(isEmpty()) {
					front = rear = 0;
					a[rear] = val;
				} else {
					rear = (rear+1)%max;
					a[rear] = val;
				}
				size++;
		  	}
		}

		int size() {
			return size;
		}

		void decFront(int rmv) {
	  		a[front]-=rmv;
	  		if (a[front] <= 0) {
	     		delete();
	  		}
		}
		
		void display() {
			if(!isEmpty()) {
				int i;
				for(i=front; i!=rear; i=(i+1)%max) {
					System.out.print(a[i] + " ");
				}
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}

		boolean isFull() {
			if(front == (rear+1)%max) return true;
			else return false;
		}

		boolean isEmpty() {
			if(size == 0)  return true;
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
	   				front = (front+1)%max;
	   			}
	   			size--;
				return temp;			}
		}
}

class Checkout {
	private int processPerMin, time;
	private int maxItems;
	private CirQueue[] lines;

	public Checkout(int nLines, int maxLineLength, int processPerMin, int maxItems) {
		this.processPerMin = processPerMin;
		this.maxItems = maxItems;
		this.time = 0;

		lines = new CirQueue[nLines]; // Initialize all the lines to zero (Start)
		for (int i = 0; i < nLines; i++) {
			lines[i] = new CirQueue(maxLineLength);
		}
	}

	public void addCustomer() {
		time += 1;
		// Shortest Line
	   int shortestLine = 0;
	   int minSize = lines[0].size();
	   for (int i = 0; i < lines.length; i++) {
	    	if (lines[i].size() < minSize) {
	        	minSize = lines[i].size();
            	shortestLine = i;
         	}
	   }

	   // Add the Customer to the Shortest Line
	   
	   Random rand = new Random();
	   int items = rand.nextInt(maxItems) + 1;
	   lines[shortestLine].insert(items);
	   
	   display();
	}

	public void incrementTime(int incLength) {
		
		time += incLength; 
		
		for (int i = 0; i < lines.length; i++) {
		   	if (lines[i].isEmpty()) {   // skip empty queues
			   continue;
			}

			lines[i].decFront(processPerMin); // decrement item count
		}

		display();
	}

	private void display() {
	   System.out.println("Time (min): " + time);
	   for (int i = 0; i < lines.length; i++) {
        	System.out.print("Line " + i + " (size: " + lines[i].size() + "): ");
         	lines[i].display();
      	}
	   System.out.println("____________");
	}
}

class CheckOutApp {
	public static void main(String[] args) {
		int nLines = 1; // Total no of Line
		int maxLineLength = 3; // Total no of customers allowed in the line
		int processPerMin = 2; // Item Processed/Min
	   	int incLength = 1; // Incremenet time always by 1
	   	int maxItems = 10; // Max item that can be bought by the customer
	   	int choice;

	   	Checkout cOut = new Checkout(nLines, maxLineLength, processPerMin, maxItems);
	   	Scanner sc = new Scanner(System.in);

	   	while(true) {
	   		System.out.println("1. To Add a Customer");
	   		System.out.println("2. To Increment Time");
	   		System.out.println("3. Quit");
	   		choice = sc.nextInt();
	   		switch(choice) {
	   			case 1 : cOut.addCustomer(); break;
	   			case 2 : cOut.incrementTime(incLength); break;
	   			case 3 : return;
	   			default: System.out.println("Invalid input. Please try again");
	   		}
	   	}
	}
}
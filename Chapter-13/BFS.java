class Queue {
  	private int max,rear,front;
	private int[] a;
	
  	public Queue(int max) {
		this.max = max;
		a = new int[max];
		rear = front = -1;
	}
	
	public void insert(int val) {
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

	public int front() {
		return a[front];
	}

	public boolean isFull() {
		if(rear == max -1) return true;
			else return false;
	}

	public boolean isEmpty() {
		if(rear == -1)  return true;
			else return false;
	}

	public int delete() {
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


class Vertex {
	int label;
	boolean isVisited;

	Vertex(int label) {
		this.label = label;
		isVisited = false;
	}
}

class Graph {
	private Vertex V[];
	private int vMax;
	private int[][] adjMat;
	public int nV;
	private Queue q;

	Graph(int vMax) {
		this.vMax = vMax; // Maximum vertex can vbe added 
		nV = 1; // counter for the vertices we will work with 1
		V = new Vertex[vMax + 1]; 
		adjMat = new int[vMax + 1][vMax + 1];
		q = new Queue(V.length);
	}

	public void addVertix(int label) {
		V[nV] = new Vertex(label);
		nV++;
	}

	public void addEdge(int s, int d) {
		adjMat[s][d] = 1;
		adjMat[d][s] = 1;
	}

	public int unVisitedAdjVet(int v) {
		for(int i=1; i<nV; i++) {
			if( adjMat[v][i] == 1 && !V[i].isVisited ) 
				return i;
		}

		return -1;
	}

	public void bfs(int start) {
		q.insert(start);
		V[start].isVisited = true;
		System.out.print(V[start].label + " ");

		while(!q.isEmpty()) {
			int vet = unVisitedAdjVet(q.front());

			if(vet == -1) {
				q.delete();
			} else {
				V[vet].isVisited = true;
				System.out.print(V[vet].label + " ");
				q.insert(vet);
			}
		}
	}
}

class BFS {
	public static void main(String[] args) {
		Graph g = new Graph(5);

		g.addVertix(1);
		g.addVertix(2);
		g.addVertix(3);
		g.addVertix(4);
		g.addVertix(5);

		/*

                  2 - 3
		 /	
		1
		 \
                   4 - 5

		*/

		g.addEdge(1, 2); 
		g.addEdge(2, 3); 
		g.addEdge(1, 4); 
		g.addEdge(4, 5);

		g.bfs(1); // 1 2 4 3 5

		//To get this output make sure to comment g.bfs(1) 
		g.bfs(2); // 2 1 3 4 5
	}
}

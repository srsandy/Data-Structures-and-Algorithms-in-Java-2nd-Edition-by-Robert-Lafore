class Stack {
	private int[] a;
   	private int ele;
   	private int size;

   	public Stack(int size) {
      	a = new int[size];
      	this.size = size;
      	ele = -1;
   	}

   	public void push(int val) {
		ele++;
		a[ele] = val;
   	}

   	public void pop() {
 		ele--;
	}

   	public boolean isEmpty() {
      	if(ele == -1) return true;
      	else return false;
   	}

   	public int top() {
   		return a[ele];
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
	private Stack s;

	Graph(int vMax) {
		this.vMax = vMax; // Maximum vertex can vbe added 
		nV = 1; // counter for the vertices we will work with 1
		V = new Vertex[vMax + 1]; 
		adjMat = new int[vMax + 1][vMax + 1];
		s = new Stack(V.length);
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

	public void mst(int start) {
		s.push(start);
		V[start].isVisited = true;

		while(!s.isEmpty()) {
			int curVet = s.top();
			int vet = unVisitedAdjVet(curVet);

			if(vet == -1) {
				s.pop();
			} else {
				V[vet].isVisited = true;
				s.push(vet);
				System.out.println(V[curVet].label + "-" + V[vet].label);
			}
		}
	}
}

class MST {
	public static void main(String[] args) {
		Graph g = new Graph(5);

		g.addVertix(1);
		g.addVertix(2);
		g.addVertix(3);
		g.addVertix(4);
		g.addVertix(5);

		// This is K5 graph : https://bit.ly/2Dnfevl
		g.addEdge(1, 2); 
		g.addEdge(1, 3); 
		g.addEdge(1, 4); 
		g.addEdge(1, 5); 
		g.addEdge(2, 3); 
		g.addEdge(2, 4); 
		g.addEdge(2, 5); 
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 5);

		g.mst(1); 
		
		/*

			  1
			/
		 2 -- 3
		     /
		    4 -- 5
		    
		*/   
		 

		//To get this output make sure to comment g.mst(1)  

		g.mst(2); 

		/*
            1
          /   \
         2     3
              /
             4 -- 5 
		*/
	}
}

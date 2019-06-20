/*
    Solved By: Sandeep Ranjan (1641012352)
    
    Solution for Programming Project
    5.1
*/

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedLinkedList {
    Node start;


    public SortedLinkedList() {
        start = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        Node p,p1;
        p = p1 = start;

        if(start == null) {
            start = newNode;
        } else { 
      
            while(p != null && data > p.data) {
                p1 = p;
                p = p.next;
            }

            if(p == null) {
                p1.next = newNode;

            } else if(p1 == p) {
                newNode.next = p; 
                start = newNode;

            } else {
                newNode.next = p;  
                p1.next = newNode;
            }
        }
    }

    public int delete() {
        int temp;
        Node p = start;

        temp = p.data;
        start = p.next;
        p.next = null;
        return temp;
    }

      public void display() {
        Node n = start;

        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}

class PriorityQueue {

    SortedLinkedList sortList;

    public PriorityQueue() {
        sortList = new SortedLinkedList();
    }

    public void insert(int data) {
        sortList.insert(data);
    }

    public int delete() {
        return sortList.delete();
    }

    public void display() {
        sortList.display();
    }
}

class PriorityLinkedlist {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.insert(10);
        pq.insert(5);
        pq.insert(7);
        pq.insert(27);
        pq.insert(25);
        pq.insert(35);

        pq.display();

        pq.delete();
        pq.delete();
        pq.display();
    }
}


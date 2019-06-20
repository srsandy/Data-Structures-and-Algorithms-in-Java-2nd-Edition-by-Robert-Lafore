/*
    Solved By: Sandeep Ranjan (1641012352)
    
    Solution for Programming Project
    4.4
*/

class PQueue {
    private int[] a;
    private int max;
    private int rear;
    private int front;
    
    //Considering smallest number to have maximum priority

    public PQueue(int max) {
        this.max = max;
        a = new int[max];
        rear = front = -1;
    }

    public boolean isFull() {
        if(rear == max -1) return true;
        else return false;
    }

    public boolean isEmpty() {
        if(rear == -1 )  return true;
        else return false;
    }

    public void display() {
        int i;
        if(!isEmpty()) {
            for(i=front;i<=rear;i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Queue is Empty");
        }  
    }

    //(Insert Slow and Delete Fast)
    

    public void insert(int val) {
        if(isFull()) {
            System.out.println("Overflow as queue is Full");
        } else {
            if(isEmpty()) {
                front = rear = 0;
                a[rear] = val;
            } else {
                int j;
                for(j=rear; j>=0; j--) {
                    if(val > a[j]) {
                        a[j+1] = a[j];
                    } else {
                        break;
                    }
                }
                a[j+1] = val;
                rear++;
                System.out.println(val + " Added");
            }
        }
    }

    public int delete() {
        if(isEmpty()) {
            System.out.println("Underflow as Queue is Empty");
            return -1;
        } else {
            int ele = a[rear];
            if(front == rear) {
                front = rear =  -1;
            } else {
                rear--;
            }
            return ele;
        }
    }

       
    

    // Project 4.4 (Insert Fast and Delete Slow)

    // public void insert(int val) {
    //     if(isFull()) {
    //         System.out.println("Overflow");
    //     } else {
    //         if(isEmpty()) {
    //             front = rear = 0;
    //             a[rear] = val;
    //         } else {
    //             rear++;
    //             a[rear] = val;
    //         }
    //     }
    // }

    // public int delete() {
    //     if(!isEmpty()) {
    //         if(rear == front) {
    //             int ele = a[rear];
    //             rear = front = -1;
                
    //             return ele;
    //         } else {              //find minimum
    //             int pos = 0;
    //             int min = a[0];

    //             for(int i=0; i<=rear; i++) {
    //                 if(a[i]<min) {
    //                     min = a[i];
    //                     pos = i;
    //                 }
    //             }

    //             for(int i=pos; i<rear; i++) {
    //                 a[i] = a[i+1];
    //             }

    //             max--;
    //             rear--;
    //             return min;
    //         }
    //     } else {
    //         System.out.println("Underflow");
    //     }
    //     return -1;
    // }

    //------------------------------------

}

class PriorityQueue {
    public static void main(String arg[]) {
        PQueue pQ=new PQueue(5);

        pQ.insert(10);
        pQ.insert(80);
        pQ.insert(20);
        pQ.insert(50);

        pQ.display();

        while(!pQ.isEmpty()) {
            System.out.print( pQ.delete() + " " );
        }

    }
}

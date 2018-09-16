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
      if (isFull()) {
         System.out.println("Stack is Full");
      } else {
         ele++;
         a[ele] = val;
      }
   }

   public int pop() {
      if (isEmpty()) {
         System.out.println("Stack is Empty");
         return -1;
      } else {
         int val = a[ele];
         ele--;
         return val;
      }
   }

   public boolean isEmpty() {
      if(ele == -1) return true;
      else return false;
   }

   public boolean isFull() {
      if(ele == size - 1) return true;
      return false;
   }

   public void display() {
      for(int i=0; i<=ele; i++) 
         System.out.print(a[i] + " ");
      System.out.println();
   }
}

class StackApp {
   public static void main(String[] args) {
      Stack theStack = new Stack(10);  
      theStack.push(20);               
      theStack.push(40);
      theStack.push(60);
      theStack.push(80);

      while( !theStack.isEmpty() ) {                             
         int value = theStack.pop();
         System.out.print(value);  
         System.out.print(" ");
      }

      System.out.println("");
   }
}

/*
   A stack allows access to only one data item: the last item inserted. 
   If you remove this item, you can access the next-to-last item inserted, and so on.
*/


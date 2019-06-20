import java.util.Scanner;

class Stack {
   private Character[] a;
   private int ele;
   private int size;

   public Stack(int size) {
      a = new Character[size];
      this.size = size;
      ele = -1;
   }

   public void push(Character ch) {
      if (isFull()) {
         System.out.println("Stack is Full");
      } else {
         ele++;
         a[ele] = ch;
      }
   }

   public Character pop() {
      if (isEmpty()) {
         System.out.println("Stack is Empty");
         return '\0';
      } else {
         Character ch = a[ele];
         ele--;
         return ch;
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
}

class Reverser {
   private String input;               
   private String output;               

   public Reverser(String in) {
      input = in; 
   }

   public String doRev() {
      int stackSize = input.length();
      Stack theStack = new Stack(stackSize);

      for(int j=0; j<input.length(); j++) {
         char ch = input.charAt(j);     
         theStack.push(ch);             
      }

      output = "";

      while( !theStack.isEmpty() ) {
         char ch = theStack.pop(); 
         output = output + ch;     
      }

      return output;
   }  
}

class ReverseApp {
   public static void main(String[] args) {
      String input, output;

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter a string: ");
      input = sc.nextLine();

      if( input == "" ) {
         System.out.println("");  
      } else {
         Reverser theReverser = new Reverser(input);
         output = theReverser.doRev(); 
         System.out.println("Reversed: " + output);
      }
   } 
}  




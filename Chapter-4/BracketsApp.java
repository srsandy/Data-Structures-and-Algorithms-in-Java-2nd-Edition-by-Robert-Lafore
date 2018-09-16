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

class BracketChecker {
   private String input;

   public BracketChecker(String in) { 
      input = in;
   }

   public void check() {
      int stackSize = input.length();   
      Stack theStack = new Stack(stackSize);

      for(int j=0; j<input.length(); j++) {
         char ch = input.charAt(j);       
         switch(ch) {
            case '{':
            case '[':
            case '(':
               theStack.push(ch);
               break;

            case '}':            
            case ']':
            case ')':
               if( !theStack.isEmpty() ) {
                  char chx = theStack.pop();
                  
                  if( (ch=='}' && chx!='{') ||
                      (ch==']' && chx!='[') ||
                      (ch==')' && chx!='(') )
                     System.out.println("Error: "+ch+" at "+j);

                  }
               else {
                  System.out.println("Error: "+ch+" at "+j);
               }

               break;

            default:
               break;
         }  
      }
      
      if( !theStack.isEmpty() ) {
         System.out.println("Error: missing right delimiter");
      }
      else {
         System.out.println("No error");
      }
   }
}  

class BracketsApp {
   public static void main(String[] args) {
      String input;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter string containing delimiters: ");
      input = sc.nextLine();

      if( input == "" ) {
         System.out.println("");  
      } else {
         BracketChecker theChecker = new BracketChecker(input);
         theChecker.check();
      }
   } 
}  
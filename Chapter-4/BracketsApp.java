class StackX {

   private int maxSize;        
   private long[] stackArray;
   private int top;           

   public StackX(int s) {
      maxSize = s;      
      stackArray = new long[maxSize];
      top = -1;                
   }

   public void push(long j) {
      stackArray[++top] = j;
   }

   public long pop() {
      return stackArray[top--];
   }

   public long peek() {
      return stackArray[top];
   }

   public boolean isEmpty() {
      return (top == -1);
   }

   public boolean isFull() {
      return (top == maxSize-1);
   }
}

class BracketChecker {
   private String input;

   public BracketChecker(String in) { 
      input = in;
   }

   public void check() {
      int stackSize = input.length();   
      StackX theStack = new StackX(stackSize);

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
      
      if( !theStack.isEmpty() )
         System.out.println("Error: missing right delimiter");
   }
}  

class BracketsApp {
   public static void main(String[] args) throws IOException {
      String input;
      
      while(true) {
         System.out.print("Enter string containing delimiters: ");
         System.out.flush();
         input = getString();

         if( input.equals("") ) break;

         BracketChecker theChecker = new BracketChecker(input);
         theChecker.check();
      } 
   } 

   public static String getString() throws IOException {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
   }
}  
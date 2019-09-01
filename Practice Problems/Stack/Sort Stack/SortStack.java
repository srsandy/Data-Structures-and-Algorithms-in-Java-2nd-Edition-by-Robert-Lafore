import java.util.Stack;

public class SortStack {

    public static void main(String args[]) {

        Stack<Integer> originalStack = new Stack<>();

        originalStack.add(14);
        originalStack.add(9);
        originalStack.add(67);
        originalStack.add(91);
        originalStack.add(101);
        originalStack.add(25);

        System.out.println("Original Stack: " + originalStack);

        Stack<Integer> sortedStack= sorting(originalStack);

        System.out.println("Sorted Stack is: " + sortedStack);
    }

    public static Stack<Integer> sorting(Stack<Integer> original) {
        Stack<Integer> temporaryStack = new Stack<>();
        
        while(!original.isEmpty()) {

            int x = original.pop();

            while(!temporaryStack.isEmpty() && temporaryStack.peek() > x) {
                original.push(temporaryStack.pop());
            }

            temporaryStack.push(x);
        }

        return temporaryStack;
    }
}
/*
	Solved by: Nagendra Singh (https://github.com/Nagendra1421)
*/

import java.io.*;  
import java.util.*;  
     class Main {  
         public static void main(String[] args) throws IOException {  
             Scanner inp = new Scanner(System.in);  
          Tree theTree = new Tree();
          while(true)  
             {  
             System.out.print("Enter first letter of show, ");  
             System.out.print("insert, find, delete, or traverse: ");  
             int choice = getChar();  
             switch(choice)  
                {  
                case 's':  
                   theTree.displayTree();  
                   break;  
                case 'i':  
                    System.out.println("Type the characters you would like to insert");  
                    String in = inp.next();  
                    char [] cArray1 = in.toCharArray();  
                    for (int i = 0; i < cArray1.length; i++)  
                    {  
                           
                        theTree.root=theTree.insert(cArray1[i], theTree.root);  
                    }  
                    break;  
                 
                  
                default:  
                   System.out.print("Invalid entry\n");  
                } 
             }   
          }     
       public static String getString() throws IOException  
          {  
          InputStreamReader isr = new InputStreamReader(System.in);  
          BufferedReader br = new BufferedReader(isr);  
          String s = br.readLine();  
          return s;  
          }  
       public static char getChar() throws IOException  
          {  
          String s = getString();  
          return s.charAt(0);  
          }   
       public static int getInt() throws IOException  
          {  
          String s = getString();  
          return Integer.parseInt(s);  
          }  
  }  
class Node {  
    public char sData;             
    public Node leftChild;          
    public Node rightChild;         
    public void displayNode() 
    {  
        System.out.print('{');  
        System.out.print(sData);  
        System.out.print(", ");  
        System.out.print("} ");  
    }  
} 
class Node {  
    public char sData; 
    public Node leftChild;
    public Node rightChild;
    public void displayNode()
    {  
        System.out.print('{');  
        System.out.print(sData);  
        System.out.print(", ");  
        System.out.print("} ");  
    }  
}
class Tree {  
   
    public Node root;
    public Tree()
    {  
        root = null;  
    }
    public Node insert(char character,Node root) {
        if(root==null){
            Node newNode = new Node();  
            Node newRootNode = new Node();  
            newRootNode.sData = '+';  
            root = newRootNode ;  
            root.leftChild = newNode;  
            root.leftChild.sData = character;
            return root;
        }else{
            if(character < root.leftChild.sData){
                root.leftChild = insert(character,root.leftChild);
                return root;
            }else{
                root.rightChild = insert(character,root.rightChild);
                return root;
            }
        }
         
    }  
 public void displayTree() {  
        Stack globalStack = new Stack();  
        globalStack.push(root);  
        int nBlanks = 32;  
        boolean isRowEmpty = false;  
        System.out.println("......................................................");  
        while (isRowEmpty == false) {  
            Stack localStack = new Stack();  
            isRowEmpty = true;  
            for (int j = 0; j < nBlanks; j++) {  
                System.out.print(' ');  
            }  
            while (globalStack.isEmpty() == false) {  
                Node temp = (Node) globalStack.pop();  
                if (temp != null) {  
                    System.out.print(temp.sData);  
                    localStack.push(temp.leftChild);  
                    localStack.push(temp.rightChild);  
   
                    if (temp.leftChild != null 
                            || temp.rightChild != null) {  
                        isRowEmpty = false;  
                    }  
                } else {  
                    System.out.print("--");  
                    localStack.push(null);  
                    localStack.push(null);  
                }  
                for (int j = 0; j < nBlanks * 2 - 2; j++) {  
                    System.out.print(' ');  
                }  
            }
            System.out.println();  
            nBlanks /= 2;  
            while (localStack.isEmpty() == false) {  
                globalStack.push(localStack.pop());  
            }  
        }
        System.out.println("......................................................");  
    }
}
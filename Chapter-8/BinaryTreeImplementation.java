/*
    Solved By: vinaypathak07 (https://github.com/vinaypathak07)
    Modified By: Sandeep Ranjan (1641012352)
*/
import java.util.*;

class Node{
    public int data;
    public Node left;
    public Node right;

    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree{
    Node root;

    public BinaryTree(){
        root = null;
    }

    public Node getRoot(){
        return root;
    }


    // ITERATIVE ADDITION OF NODES
    public void addNode(int data) {
        Node newNode = new Node(data);

        if(root == null) {
            root = newNode;
        } else {
            Node p = root;

            while(p != null) {

                if(p.data > data) {
                    if(p.left == null) {
                        p.left = newNode;
                        break;
                    }

                    p = p.left;

                } else {
                    if(p.right == null) {
                        p.right = newNode;
                        break;
                    }

                    p = p.right;
                }
            }
        }
    }


    // RECURSIVE ADDITION OF NODES

    // public void addNode(Node newNode, Node root) {

    //     if( root == null) {
    //         this.root = newNode;
    //         return;
    //     }

    //     if(newNode.data > root.data){
    //         if(root.right != null)
    //             addNode(newNode, root.right);
    //         else
    //             root.right = newNode;
    //     }
    //     else{
    //         if(root.left != null)
    //             addNode(newNode, root.left);
    //         else
    //             root.left=newNode;
    //     }
    // }


    public void delete(int key) {
        if(root == null) {
            System.out.println("Tree has 0 nodes");
            return;
        }

        Node p = root;
        Node p1 = null;

        while(p != null && p.data != key) {
            p1 = p;

            if(p.data > key) {
                p = p.left;
            } else {
                p = p.right;
            }
        }

        if(p == null) {
            System.out.println("Key does not exist");
            return;
        }

        if(p.left == null && p.right == null) {

            if(p.data > p1.data) {
                p1.right = null;
            } else {
                p1.left = null;
            }

        } else if(p.left != null && p.right == null) {

            if(p1.data > p.left.data) {
                p1.left = p.left;
            } else {
                p1.right = p.left;
            }

        } else if(p.right != null && p.left == null) {

            if(p1.data > p.right.data) {
                p1.right = p.right;
            } else {
                p1.right = p.right;
            }

        } else if(p.right != null && p.left != null ) {
            Node s = p.right;
            Node s1 = null;

            if(s.left != null) {

                while(s.left != null) {
                    s1 = s;
                    s = s.left;
                }

                if(s1 != null)
                    s1.left = null; // to break the link

                if(s.right != null) {
                    s1.left = s.right;
                }
                
                s.right = p.right;
            }

            s.left = p.left;

            if(p1 != null) {
                if(p1.data > s.data) {
                    p1.left = s;
                } else {
                    p1.right = s;
                }
            } else {
                root = s;
            }
        } 

    }

    public int countNodes(Node root) {
    	if(root == null) 
    		return 0;
        
    	return countNodes(root.left) + 1 + countNodes(root.right);
    }

    public void inOrderPrint(Node root){
        if(root == null)
            return;

        inOrderPrint(root.left);
        System.out.print(root.data + " | ");
        inOrderPrint(root.right);
    }

    public void preOrderPrint(Node root){
        if(root == null)
            return;

        System.out.print(root.data + " | ");
        preOrderPrint(root.left);
        preOrderPrint(root.right);
    }

    
    public void postOrderPrint(Node root){
        if(root==null)
            return;

        postOrderPrint(root.left);
        postOrderPrint(root.right);
        System.out.print(root.data + " | ");
    }
    
     public void levelOrderPrint(Node root) {
    	Queue<Node> q = new LinkedList<>(); 
    	
    	if(root == null) {
    		return;
    	}
    	
    	q.add(root);
    	Node temp = q.peek();
    	while(q.size() > 0) {
    		System.out.print(temp.data + " | ");
    		if(temp.left != null)
    			q.add(temp.left);

    		if(temp.right != null)
    			q.add(temp.right);
    		
    		q.remove();
    		temp = q.peek();
    	}
    }
    
    //Height of the Tree
    public int height(Node root) {
        if (root == null)
           return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight + 1);
            else return(rheight + 1);
        }
    }
    
}
public class BinaryTreeImplementation{
    public static void main(String[] args){

        int[] nodes = {13, 4, 9, 6, 23, 27, 21, 22, 15, 3, 2, 7};
        BinaryTree bst = new BinaryTree();


        for(int i=0; i<nodes.length; i++) {
            bst.addNode(nodes[i]);
            // bst.addNode(new Node(x[i]),bst.getRoot());
        }

        /*
                     13
                   /    \
                  4       23
                 / \    /    \
                3   9  21    27
               /   /  / \
              2   6  15  22
                   \
                    7
        */

        System.out.println("::__Pre Order Traversal__::");
        bst.preOrderPrint(bst.getRoot());

        System.out.println();
        System.out.println("::__In Order Traversal__::");
        bst.inOrderPrint(bst.getRoot());

        System.out.println();
        System.out.println("::__Post Order Traversal__::");
        bst.postOrderPrint(bst.getRoot());
        System.out.println();
        
        System.out.println();
        System.out.println("::__Level Order Traversal__::");
        bst.levelOrderPrint(bst.getRoot());
        System.out.println();


        // Delete 7
        bst.delete(7);


        /*
                     13
                   /    \
                  4       23
                 / \    /    \
                3   9  21    27
               /   /  / \
              2   6  15  22

        Inorder : 2 3 4 6 9 13 15 21 22 23 27
        */

        // Delete 3
        bst.delete(3);

        /*
                     13
                   /    \
                  4       23
                 / \    /    \
                2   9  21    27
                   /  / \
                  6  15  22

        Inorder : 2 4 6 9 13 15 21 22 23 27
        */

        // Delete 4
        bst.delete(4);

        /*
                     13
                   /    \
                  6       23
                 / \    /    \
                2   9  21    27
                      / \
                     15  22

        Inorder : 2 6 9 13 15 21 22 23 27
        */

        // Delete 23 
        bst.delete(23);

        /*
                     13
                   /    \
                  6      27
                 / \    /   
                2   9  21   
                      / \
                     15  22

        Inorder : 2 6 9 13 15 21 22 27
        */

        // Delete 13 
        bst.delete(13);

        /*
                     15
                   /    \
                  6      27
                 / \    /   
                2   9  21   
                        \
                        22

        Inorder : 2 6 9 15 21 22 27
        */

    }
}

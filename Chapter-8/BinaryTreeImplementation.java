/*
    Solved By: vinaypathak07 (https://github.com/vinaypathak07)
    Modified By: Sandeep Ranjan (1641012352)
*/

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
}
public class BinaryTreeImplementation{
    public static void main(String[] args){

        int[] nodes = {11,15,18,24,33,8,7,6,9,14,4,1,55,25,17};
        BinaryST bst = new BinaryST();


        for(int i=0; i<nodes.length; i++) {
            bst.addNode(x[i]);
            // bst.addNode(new Node(x[i]),bst.getRoot());
        }

        System.out.println(":::::::::::Pre Order Traversal:::::::::::");
        bst.preOrderPrint(bst.getRoot());

        System.out.println();
        System.out.println(":::::::::::In Order Traversal:::::::::::");
        bst.inOrderPrint(bst.getRoot());

        System.out.println();
        System.out.println(":::::::::::Post Order Traversal:::::::::::");
        bst.postOrderPrint(bst.getRoot());
    }
}

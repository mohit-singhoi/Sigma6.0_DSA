package Part1;
// Given a binary tree, find the sum of all the nodes in the tree.

public class NodeSum {
    static class Node{
        int data;
        Node left;
        Node right;

          Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Sum of all Nodes
    public static int totalSum(Node root){
       // int treesum =0;
        if(root == null){
            return 0;
        }

       int  lsum = totalSum(root.left);
       int  rsum = totalSum(root.right);
       return   lsum +rsum +root.data;
    }



    // Main Fun
    public static void main(String[] args) {
    /*                   1
                        /  \
                       2    3
                      / \  / \
                     4   5 6  7
             
   */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println("Total Sum of All Nodes : " + totalSum(root));
    }
}

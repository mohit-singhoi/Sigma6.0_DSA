// Height of a binary tree is the number of edges on the longest path from the root to a leaf node using recursion.
public class HeightOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Height of the tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Main class to build the tree
    public static void main(String[] args) { // O(n) time complexity
        
    /*                   1
                        /  \
                       2    3
                      / \  / \
                     4   5 6  7
             
   */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        System.out.println("Height of the tree is: " + height(root));

    }
    
}

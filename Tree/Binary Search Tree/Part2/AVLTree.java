// AVL Tree : Balanced BST

package Part2;

public class AVLTree {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;

        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Right rotate subtree rotated with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;
    }

    // GetBalance
    public static int getBalance(Node root) {
        if (root == null)
            return 0;

        return height(root.left) - height(root.right);
    }

    // Insert Node
    public static Node insert(Node root , int key){
        if(root == null)
            return new Node(key);
        
       else if(key < root.data)
            root.left = insert(root.left , key);
       else  if(key > root.data)
        root.right = insert(root.right, key);
       else
        return root; // Duplicate key not allowed


    // Update root height
    root.height = 1+ Math.max(height(root.left) , height(root.right));

    // Get root's balance factor
    int bf = getBalance(root);

    // Left Left Case
    
    }
}

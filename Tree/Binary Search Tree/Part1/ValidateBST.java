// Given the root of a binary tree, determine if it is a valid binary search tree (BST).

public class ValidateBST {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Insert a new node with given key in BST
    public static Node insert(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            return new Node(key);   
        }
        // Otherwise, recur down the tree
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        // Return the unchanged root pointer
        return root;
    }

    // Function to check if a binary tree is a valid BST : O(n)
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }


    // Main method to test the code
    public static void main(String[] args) {
        int keys[] = { 5, 3, 7, 2, 4, 6, 8 };
        Node root = null;
        for (int key : keys) {
            root = insert(root, key);
        }

        if (isValidBST(root, null, null)) {
            System.out.println("The binary tree is a valid BST.");
        } else {
            System.out.println("The binary tree is not a valid BST.");
        }
    }
    
}

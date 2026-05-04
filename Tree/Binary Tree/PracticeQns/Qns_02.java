// Qns_02 : Invert a Binary Tree.
// Mirror of a Tree: Given a binary tree, the task is to invert the binary tree. Inverting a binary tree means that for every node in the tree, we swap its left and right children.

package PracticeQns;

public class Qns_02 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void invertTree(Node root) {
        if (root == null) {
            return; // Base case: If the tree is empty, return
        }

        // Swap the left and right children of the current node
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);
    }

    // Helper function to print the tree in-order
    public static void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) { // O(n) time complexity, where n is the number of nodes in the tree
        // Example usage:

        /*
         * Original Tree:
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         * Inverted Tree:
         * 1
         * / \
         * 3 2
         * / \ / \
         * 7 6 5 4
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Original Tree:");
        printInOrder(root); // Function to print the tree in-order

        invertTree(root);

        System.out.println("\nInverted Tree:");
        printInOrder(root); // Function to print the tree in-order
    }

}

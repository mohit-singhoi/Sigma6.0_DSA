// Qns_03 : Delete leaf nodes with values as X in a Binary Tree.
// Given a binary tree and a value X, the task is to delete all the leaf nodes with values as X in the binary tree.  Also delete the newly formed leaves with the target values as x.

package PracticeQns;

public class Qns_03 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node deleteLeafNodes(Node root, int x) {
        if (root == null) {
            return null; // Base case: If the tree is empty, return null
        }

        // Recursively delete leaf nodes in the left and right subtrees
        root.left = deleteLeafNodes(root.left, x);
        root.right = deleteLeafNodes(root.right, x);

        // Check if the current node is a leaf node with value x
        if (root.left == null && root.right == null && root.data == x) {
            return null; // Delete the leaf node by returning null
        }

        return root; // Return the modified tree
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

    public static void main(String[] args) {
        // Example usage:

        /* Original Tree:
         *      1
         *     /  \
         *     2   3
         *    / \  / \
         *    4 5  6  5
         * 
         * 
         * After deleting leaf nodes with value 5:
         *      1
         *     /  \
         *    2     3
         *   / \    / \
         *   4  n   6  n
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); // This is a leaf node with value X=5
        root.right.left = new Node(6);
        root.right.right = new Node(5); // This is a leaf node with value X=5

        int x = 5; // Target value to delete

        System.out.println("Original Tree (In-order):");
        printInOrder(root);
        System.out.println();

        root = deleteLeafNodes(root, x);

        System.out.println("Tree after deleting leaf nodes with value " + x + ":");
        printInOrder(root);
        System.out.println();
    }
}

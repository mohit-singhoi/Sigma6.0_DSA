// Qns_01 : Check if a Binary Tree is Unvalued or not.
// We have a binary tree, the task is to check if the binary tree is unvalued or not. If it found to be true , then print YES. Otherwise , print NO.

package PracticeQns;

public class Qns_01 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isUnivalued(Node root) {
        if (root == null) {
            return true; // An empty tree is considered univalued
        }

        int value = root.data; // Get the value of the root node

        // Check if all nodes in the left subtree are equal to the root value
        if (!isUnivalued(root.left) || (root.left != null && root.left.data != value)) {
            return false;
        }

        // Check if all nodes in the right subtree are equal to the root value
        if (!isUnivalued(root.right) || (root.right != null && root.right.data != value)) {
            return false;
        }

        return true; // All nodes have the same value
    }

    public static void main(String[] args) { // O(n) time complexity, where n is the number of nodes in the tree
        // Example usage:
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(10); // Change this value to make the tree univalued or not

        if (isUnivalued(root)) {
            System.out.println("YES it is a univalued tree");
        } else {
            System.out.println("NO it is not a univalued tree");
        }
    }

    
}

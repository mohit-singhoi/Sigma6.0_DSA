// Qns_05 :  Maximum Path Sum in a Binary Tree
// Given a binary tree, find the maximum path sum. The path may start and end at any node in the tree. The path must contain at least one node and does not need to go through the root.
package PracticeQns;

public class Qns_05 {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(Node root) {
        if (root == null) {
            return 0; // Base case: If the tree is empty, return 0
        }

        // Recursively calculate the maximum path sum for left and right subtrees
        int leftSum = Math.max(0, maxPathSum(root.left)); // Ignore negative sums
        int rightSum = Math.max(0, maxPathSum(root.right)); // Ignore negative sums

        // Update the global maximum path sum if the current path is greater
        maxSum = Math.max(maxSum, root.data + leftSum + rightSum);

        // Return the maximum path sum including the current node and one of its subtrees
        return root.data + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {
        // Example usage:

        /*
         * Original Tree:
         *      -10
         *     /   \
         *    9    20
         *   / \   / \
         *   n 10  15  7
         * 
         * Maximum Path Sum: 44 (10 + 9 + -10 + 20 + 15)
         */

        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.left.right = new Node(10);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        maxPathSum(root);
        System.out.println("Maximum Path Sum: " + maxSum);
    }
    
}

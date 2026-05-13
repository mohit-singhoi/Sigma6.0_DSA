// Qns_05 : maximum Sum BST in Binary Tree
// We have a binary tree, the task is to print the maximum sum of nodes of a sub-tree which is also a Binary Search Tree.

package PracticeQns;

public class Qns_05 {
      // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Info class
    static class Info {
        boolean isBST;
        int sum;
        int min;
        int max;

        Info(boolean isBST, int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    static int maxSum = 0;

    // Function to find Maximum Sum BST
    public static Info maxSumBST(Node root) {

        // Base Case
        if (root == null) {
            return new Info(true, 0,
                    Integer.MAX_VALUE,
                    Integer.MIN_VALUE);
        }

        Info left = maxSumBST(root.left);
        Info right = maxSumBST(root.right);

        // Check BST condition
        if (left.isBST &&
            right.isBST &&
            root.data > left.max &&
            root.data < right.min) {

            int currSum = left.sum + right.sum + root.data;

            // Update answer
            maxSum = Math.max(maxSum, currSum);

            return new Info(
                    true,
                    currSum,
                    Math.min(root.data, left.min),
                    Math.max(root.data, right.max)
            );
        }

        // Not BST
        return new Info(false, 0, 0, 0);
    }

    public static void main(String[] args) {

        /*
                 5
               /   \
              9     2
             /       \
            6         3
           / \
          8   7

        Maximum Sum BST = 8
        */

        Node root = new Node(5);

        root.left = new Node(9);
        root.right = new Node(2);

        root.left.left = new Node(6);

        root.right.right = new Node(3);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(7);

        maxSumBST(root);

        System.out.println("Maximum Sum BST = " + maxSum);
    }
}

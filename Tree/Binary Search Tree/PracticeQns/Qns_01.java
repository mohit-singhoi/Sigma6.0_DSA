// Qns_01 : Range Sum of BST 
// We have a Binary Serach Tree consisting of N nodes and two positive integers L and R, the task is to find the sum of values of all the nodes that lie in  the range [L,R]
package PracticeQns;

public class Qns_01 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to calculate range sum
    public static int rangeSum(Node root, int L, int R) {

        // Base case
        if (root == null) {
            return 0;
        }

        // If node value is smaller than L,
        // search only right subtree
        if (root.data < L) {
            return rangeSum(root.right, L, R);
        }

        // If node value is greater than R,
        // search only left subtree
        if (root.data > R) {
            return rangeSum(root.left, L, R);
        }

        // Node lies in range
        return root.data
                + rangeSum(root.left, L, R)
                + rangeSum(root.right, L, R);
    }

    public static void main(String[] args) {

        /*
         * 8
         * / \
         * 5 11
         * / \ \
         * 3 6 20
         */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(20);

        int L = 5;
        int R = 6;

        int result = rangeSum(root, L, R);

        System.out.println("Sum = " + result);
    }

}

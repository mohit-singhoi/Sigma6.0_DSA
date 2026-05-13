// Qns_02 : Find the closest element in the binary tree
// We have a Binary Search Tree and a target node k . the task is to find the node with minimum absolute difference with given target value k.

package PracticeQns;

public class Qns_02 {
     // Node Class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to find closest value
    public static int closestElement(Node root, int k) {
        int closest = root.data;

        while (root != null) {

            // Update closest if current node is nearer
            if (Math.abs(root.data - k) < Math.abs(closest - k)) {
                closest = root.data;
            }

            // Move left or right according to BST property
            if (k < root.data) {
                root = root.left;
            } else if (k > root.data) {
                root = root.right;
            } else {
                // Exact match found
                return root.data;
            }
        }

        return closest;
    }

    // Inorder Traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        /*
                    8
                  /   \
                 5     11
                / \      \
               3   6      20
        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(20);

        System.out.print("Inorder Traversal : ");
        inorder(root);

        int k = 5;

        int ans = closestElement(root, k);

        System.out.println("\nTarget Value : " + k);
        System.out.println("Closest Element : " + ans);
    }
}

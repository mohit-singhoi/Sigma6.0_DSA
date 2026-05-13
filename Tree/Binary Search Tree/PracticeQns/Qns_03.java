// Qns_03 : Find k-th smallest element in BST
// We have the root of a binary search tree and K as input, find the kth smallest element in BST.


package PracticeQns;
import java.util.Scanner;

public class Qns_03 {
    // Node Class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int count = 0;
    static int result = -1;

    // Inorder Traversal to find kth smallest
    public static void kthSmallest(Node root, int k) {

        if (root == null) {
            return;
        }

        // Visit left subtree
        kthSmallest(root.left, k);

        // Increase count
        count++;

        // If count becomes k
        if (count == k) {
            result = root.data;
            return;
        }

        // Visit right subtree
        kthSmallest(root.right, k);
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
        Scanner sc = new Scanner(System.in);

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

        System.out.print("Enter the Value of K : ");
        int k = sc.nextInt();

        kthSmallest(root, k);

        System.out.println("\n" + k + "rd Smallest Element : " + result);
    }
}

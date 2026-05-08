// This class will contain the code to convert a sorted array into a balanced binary search tree (BBST).

//package Part2;
import java.util.*;

public class SortedArr2BBST {
    // Definition for a binary tree node.
    public static class Node{ 
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    // Preorder
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node node = new Node(arr[mid]);
        node.left = createBST(arr, start, mid - 1);
        node.right = createBST(arr, mid + 1, end);
        return node;
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] Arr = {3, 5, 6, 8, 10, 11, 12};

        /*
                      8
                    /   \
                   5     11
                  / \    / \
                3   6  10  12

         */
        Node root = createBST(Arr, 0, Arr.length - 1);
        System.out.println("Preorder traversal of the balanced binary search tree:");
        preorder(root);

    
}

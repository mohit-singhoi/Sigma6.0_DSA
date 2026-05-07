// Given a binary tree, return all root-to-leaf paths.

import java.util.*;

public class RootToLeafPath {
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

    // printpath
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    // Function to print all root-to-leaf paths in a binary tree
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // add current node to path
        path.add(root.data);

        // leaf node
        if (root.left == null && root.right == null) {
            printPath(path);
            return;
        }

        // recursive calls
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);

        // backtracking
        path.remove(path.size() - 1);
    }

    // Main method to test the above functions
    public static void main(String[] args) {
        int values[] = { 10, 5, 15, 3, 7, 12, 18 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printRootToLeaf(root, new ArrayList<>());

    }

}

// Search in a Binary Search Tree

public class SearchBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
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

    
    // Search operation in a BST
    public static boolean search(Node root, int key) {
        // Base case: root is null or key is present at root
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        // Key is greater than root's data
        if (root.data < key) {
            return search(root.right, key);
        }

        // Key is smaller than root's data
        return search(root.left, key);
    }

    // Main function
    public static void main(String[] args) {
        int values[] = { 4, 2, 7, 1, 3 };
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        // Search for a key
        int key = 3;
        if (search(root, key)) {
            System.out.println("Key " + key + " found in the BST.");
        } else {
            System.out.println("Key " + key + " not found in the BST.");
        }
    }
    
}

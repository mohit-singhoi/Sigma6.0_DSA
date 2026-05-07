// Delete a node in a Binary Search Tree

public class DeleteNode {
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

    // Function to delete a node from BST : O(h) where h is the height of the tree
    public static Node delete(Node root, int value) {
        // Base case: If the tree is empty
        if (root == null) {
            return root;
        }
        // Recur down the tree
        if (value < root.data) {
            root.left = delete(root.left, value);
        } else if (value > root.data) {
            root.right = delete(root.right, value);
        } 
        else {
            // Node with only one child or no child
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Single child
            else if (root.left == null) {
                return root.right;
            }
             else if (root.right == null) {
                return root.left;
            }

            // Case 3: Node with two children
            // Node with two children: Get the inorder successor (smallest in the right subtree)
        Node IS = findInorderSuccessor(root.right);
        root.data = IS.data;
            // Delete the inorder successor
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // Function to find the inorder successor of a node
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Function to perform inorder traversal of the tree
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Main function
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }

        // Inorder traversal before deletion
        System.out.println("Inorder traversal before deletion:");
        inorder(root);
        System.out.println();

        // Delete a key
        int keyToDelete = 3;
        root = delete(root, keyToDelete);
        System.out.println("Inorder traversal after deleting " + keyToDelete + ":");
        inorder(root);
        
    }
}

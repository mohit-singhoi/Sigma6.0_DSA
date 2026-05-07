// Given the root of a binary tree, return the mirror image of the tree.

public class MirrorBST {
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


    // preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Function to mirror a binary tree : O(n)
    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        // mirror left and right subtrees
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        // swap left and right subtrees
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    // Main method to test the code
    public static void main(String[] args) {

        /* Original tree
         *       5
         *      / \
         *     3   7
         *    / \ / \
         *   2  4 6  8
         * 
         * 
         * Mirror tree
         *       5
         *      / \
         *     7   3
         *    / \ / \
         *   8  6 4  2
         */

        ////1. Using insert function
        // int keys[] = { 5, 3, 7, 2, 4, 6, 8 };
        // Node root = null;
        // for (int key : keys) {
        //     root = insert(root, key);
        // }

        //2. Manually creating the tree
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);   
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8); 
        
        preorder(root);
        System.out.println();
        root = mirror(root);
        preorder(root);

    }
}

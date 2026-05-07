// Print all the elements in the given range in a BST

public class PrintInRange {
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

   // // Function to print all elements in the given range in a BST
    // public static void printInRange(Node root, int k1, int k2) {
    //      int low = k1;
    //      int high = k2;
    //     if (root == null) {
    //         return;
    //     }
    //     // If root's data is greater than low, then only we can get values in left subtree
    //     if (root.data > low) {
    //         printInRange(root.left, low, high);
    //     }
    //     // If root's data is in range, then print it
    //     if (root.data >= low && root.data <= high) {
    //         System.out.print(root.data + " ");
    //     }
    //     // If root's data is smaller than high, then only we can get values in right subtree
    //     if (root.data < high) {
    //         printInRange(root.right, low, high);
    //     }
    // }

    public static void printInRange(Node root, int low, int high) {
        if (root == null) {
            return;
        }

        if(root.data >= low && root.data <= high) {
            printInRange(root.left, low, high);
            System.out.print(root.data + " ");
            printInRange(root.right, low, high);
        }

        else if(root.data < low) {
            printInRange(root.left, low, high);
        }

        else {
            printInRange(root.right, low, high);
        }

    }


    // Main function
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
        int low = 5;
        int high = 11;
        System.out.print("Elements in the range [" + low + ", " + high + "] are : " + "");
        printInRange(root, low, high);
    }
    
}

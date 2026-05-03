// Transform a given Binary Tree to a Sum Tree. A Sum Tree is a Binary Tree where the value of each node is equal to the sum of the values of its left and right subtrees in the original tree. The value of a leaf node is changed to 0.

package Part3;

public class TransformSum {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int transformToSumTree(Node root) {
        if (root == null) return 0;

        int leftSum = transformToSumTree(root.left);
        int rightSum = transformToSumTree(root.right);

        int oldValue = root.data;
        root.data = leftSum + rightSum;

        return oldValue + root.data;
    }

    // Print tree
    public static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        /*    Original Tree:
                1
               /  \
              2    3
             / \  / \
            4   5 6  7




        After transformation to Sum Tree:

                27
               /  \
              9    13
             / \  / \
            0   0 0  0
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transformToSumTree(root);
        System.out.println("Root after transformation: " + root.data); // Should print 27
        System.out.println("Left child of root after transformation: " + root.left.data); //
        System.out.println("Right child of root after transformation: " + root.right.data); // Should print 13
        System.out.print("Inorder traversal of the transformed Sum Tree : " + " ");
        printInorder(root); // Should print 0 9 0 27 0
    }
    
}

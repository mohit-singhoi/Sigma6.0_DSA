// WAP to check if a binary tree is subtree of another binary tree.
// Given a roots of two binary tree root and subroot , return true if there is a subtree of root  with the same structure and node values of subroot and false otherwise.
public class Subtree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(node.right, subRoot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubstree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubstree(root.left, subRoot) || isSubstree(root.right, subRoot);
    }

    // Main Function
    public static void main(String[] args) {
        /*
         * Tree   1
         *       /  \
         *      2   3
         *     / \  / \
         *    4  5  6  7
         * 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    

    /*Subtree
     *  2
     * / \
     * 4  5
     */

    Node subRoot = new Node(2);
    subRoot.left=new Node(4);
    subRoot.right=new Node(5);

    System.out.println("Is Subtree: " + isSubstree(root, subRoot));
    }
}

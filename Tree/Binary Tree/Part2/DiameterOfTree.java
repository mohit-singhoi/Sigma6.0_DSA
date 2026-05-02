// Diameter of a tree is the longest path between any two nodes in the tree. The path may or may not pass through the root.
public class DiameterOfTree {
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

    // Finding the height of Node
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;

    }

    // Finding Diameter of Tree
    public static int diameter(Node root) { // O(n^2) time complexity
        if (root == null) {
            return 0;
        }

        int ldiam = diameter(root.left);
        int lh = height(root.left);

        int rdiam = diameter(root.right);
        int rh = height(root.right);

        int selfDiam = lh + rh + 1;

        return Math.max(Math.max(ldiam, rdiam), selfDiam);
    }

    // Main fun
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of a Tree is : " + height(root));
        System.out.println("Diameter of Tree is : " + diameter(root));

    }

}

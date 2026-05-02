// WAP to print the nodes at the kth level of a binary tree. The root node is considered to be at level 0 using recursion.
package Part3;

public class KthLevel {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void printKthLevel(Node root, int level ,int k) {
        if (root == null) return;

        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }

        printKthLevel(root.left, level + 1, k);
        printKthLevel(root.right, level + 1, k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int k = 2;
        System.out.print("Nodes at level " + k + ":");
        printKthLevel(root, 0, k);
    }
    
}

// Minimum Distance between two nodes in a Binary Tree.
package Part3;

public class MinDistance {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node findLCA(Node root, int n1, int n2) {
        if (root == null) return null;

        if (root.data == n1 || root.data == n2) return root;

        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) return root;

        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) return -1;
        if (root.data == n) return 0;

        int leftDist = lcaDist(root.left, n);
        if (leftDist != -1) return leftDist + 1;

        int rightDist = lcaDist(root.right, n);
        if (rightDist != -1) return rightDist + 1;

        return -1;
    }


    public static int findDistance(Node root, int n1, int n2) {
        Node lca = findLCA(root, n1, n2);
        if (lca == null) return -1;

        int d1 = lcaDist(lca, n1);
        int d2 = lcaDist(lca, n2);

        return d1 + d2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 6;
        int distance = findDistance(root, n1, n2);
        if (distance != -1) {
            System.out.println("Minimum distance between " + n1 + " and " + n2 + " is: " + distance);
        } else {
            System.out.println("One or both nodes not found in the tree.");
        }
    }
    
}

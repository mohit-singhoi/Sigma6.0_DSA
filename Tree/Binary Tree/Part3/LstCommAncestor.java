// Lowest Common Ancestor in a Binary Tree using a recursive approach. The LCA of two nodes n1 and n2 in a binary tree is the lowest (i.e., deepest) node that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

package Part3;

public class LstCommAncestor {
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

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        Node lca = findLCA(root, n1, n2);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {
            System.out.println("One or both nodes not found in the tree.");
        }
    }
    
}


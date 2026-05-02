package Part1;
// Post Order Traversal of Binary Tree

public class BinaryTreePostOrder {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Postorder Traversal
    public static void postorder(Node root) {
        if (root == null) {
            // System.out.print("-1"+ " ");
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) { // O(n) time complexity
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = BinaryTree.buildTree(nodes);

        System.out.println("Root Node: " + root.data);

        System.out.print("Postorder Traversal: ");
        postorder(root);
    }
    
}

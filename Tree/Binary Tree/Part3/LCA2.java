// Find LCA using APproach 2. This approach is more efficient than the first approach as it does not require storing the paths from the root to the given nodes. Instead, it uses a single traversal of the tree to find the LCA.
package Part3;

public class LCA2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        // LeftLCA = val and RightLCA = null -> LCA is in left subtree
        if(rightLCA == null){
            return leftLCA;
        }
        // RightLCA = val and LeftLCA = null -> LCA is in right subtree
        if(leftLCA == null){
            return rightLCA;
        }
        // Both left and right subtrees have one of the nodes -> current node is LCA
        return root;
    }

    // Main method to test the LCA function
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 

        /*      
                1
              /   \
             2     3
            / \   / \
           4   5 6   7
        */
        int n1 = 4, n2 = 5;
        Node lca = lca(root, n1, n2);
        if (lca != null) {
            System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {
            System.out.println("One or both nodes not found in the tree.");
        }
    }
}

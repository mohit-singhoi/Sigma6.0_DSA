// Red Balck Tree Program

package Part2;

public class RedBlackTree {

    public Node root; // root node

    public RedBlackTree() {
        super();
        root = null;
    }

    static class Node {
        int data;
        Node left;
        Node right;
        char colour;
        Node parent;

        Node(int data) {
            super();
            this.data = data; // only including data. not key
            this.left = null; // left subtree
            this.right = null; // right subtree
            this.colour = 'R'; // colour either 'R' or 'B'
            this.parent = null; // required at time of rechecking
        }
    }

    // this function performs left rotation
    Node rotateLeft(Node node) {

        Node x = node.right;
        Node y = x.left;

        x.left = node;
        node.right = y;
        node.parent = x;

        // parent resetting is also important
        if (y != null)
            y.parent = node;

        return x;
    }

    // this function performs right rotation
    Node rotateRight(Node node) {

        Node x = node.left;
        Node y = x.right;

        x.right = node;
        node.left = y;
        node.parent = x;

        if (y != null)
            y.parent = node;

        return x;
    }

    // flags for rotations
    boolean ll = false;
    boolean rr = false;
    boolean lr = false;
    boolean rl = false;

    // helper function for insertion
    Node insertHelp(Node root, int data) {

        // f is true when RED RED conflict occurs
        boolean f = false;

        // recursive calls according to BST property
        if (root == null)
            return (new Node(data));

        else if (data < root.data) {

            root.left = insertHelp(root.left, data);
            root.left.parent = root;

            if (root != this.root) {
                if (root.colour == 'R' && root.left.colour == 'R')
                    f = true;
            }
        }

        else {

            root.right = insertHelp(root.right, data);
            root.right.parent = root;

            if (root != this.root) {
                if (root.colour == 'R' && root.right.colour == 'R')
                    f = true;
            }
        }

        // rotations
        if (this.ll) {

            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';
            this.ll = false;
        }

        else if (this.rr) {

            root = rotateRight(root);
            root.colour = 'B';
            root.right.colour = 'R';
            this.rr = false;
        }

        else if (this.rl) {

            root.right = rotateRight(root.right);
            root.right.parent = root;

            root = rotateLeft(root);
            root.colour = 'B';
            root.left.colour = 'R';

            this.rl = false;
        }

        else if (this.lr) {

            root.left = rotateLeft(root.left);
            root.left.parent = root;

            root = rotateRight(root);
            root.colour = 'B';
            root.right.colour = 'R';

            this.lr = false;
        }

        // handle RED RED conflict
        if (f) {

            // if parent is right child of grandparent
            if (root.parent.right == root) {

                // uncle is black
                if (root.parent.left == null ||
                        root.parent.left.colour == 'B') {

                    if (root.left != null &&
                            root.left.colour == 'R')
                        this.rl = true;

                    else if (root.right != null &&
                            root.right.colour == 'R')
                        this.ll = true;
                }

                // uncle is red
                else {

                    root.parent.left.colour = 'B';
                    root.colour = 'B';

                    if (root.parent != this.root)
                        root.parent.colour = 'R';
                }
            }

            // parent is left child of grandparent
            else {

                // uncle is black
                if (root.parent.right == null ||
                        root.parent.right.colour == 'B') {

                    if (root.left != null &&
                            root.left.colour == 'R')
                        this.rr = true;

                    else if (root.right != null &&
                            root.right.colour == 'R')
                        this.lr = true;
                }

                // uncle is red
                else {

                    root.parent.right.colour = 'B';
                    root.colour = 'B';

                    if (root.parent != this.root)
                        root.parent.colour = 'R';
                }
            }

            f = false;
        }

        return root;
    }

    // function to insert data into tree
    public void insert(int data) {

        if (this.root == null) {

            this.root = new Node(data);
            this.root.colour = 'B';
        }

        else
            this.root = insertHelp(this.root, data);
    }

    // helper function for inorder traversal
    void inorderTraversalHelper(Node node) {

        if (node != null) {

            inorderTraversalHelper(node.left);
            System.out.printf("%d ", node.data);
            inorderTraversalHelper(node.right);
        }
    }

    // inorder traversal
    public void inorderTraversal() {
        inorderTraversalHelper(this.root);
    }

    // helper function to print tree
    void printTreeHelper(Node root, int space) {

        int i;

        if (root != null) {

            space = space + 10;

            printTreeHelper(root.right, space);

            System.out.printf("\n");

            for (i = 10; i < space; i++) {
                System.out.printf(" ");
            }

            System.out.printf("%d", root.data);
            System.out.printf("\n");

            printTreeHelper(root.left, space);
        }
    }

    // print tree
    public void printTree() {
        printTreeHelper(this.root, 0);
    }

    public static void main(String[] args) {

        RedBlackTree t = new RedBlackTree();

        int[] arr = {1, 4, 6, 3, 5, 7, 8, 2, 9};

        for (int i = 0; i < 9; i++) {

            t.insert(arr[i]);

            System.out.println();
            t.inorderTraversal();
        }

        System.out.println("\n\nRed Black Tree:\n");

        t.printTree();
    }
}
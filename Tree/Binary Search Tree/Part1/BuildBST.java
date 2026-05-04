// Build a BST
// Values[] = {5,1,3,4,2,7}

//package Binary Search Tree.Part1;

public class BuildBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left subtree
            root.left = insert(root.left, val);
        } else{
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Print tree
    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);

    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        // traverse value
        for(int i=0; i<values.length;i++){
            root = insert(root, values[i]);
        }

        // Print BST
        System.out.println("Print Tree in InOrder " );
        inOrder(root);
        System.out.println();
        
    }
    
}

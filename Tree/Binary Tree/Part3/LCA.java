// Calculate Lowest Common Ancestor.
package Part3;

import java.util.ArrayList;

public class LCA {
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

    public static boolean getPath(Node root , int n , ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        if(getPath(root.left, n, path) || getPath(root.right, n, path)){
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    // Find LCA
    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //Last common ancestor
        int i;
        for(i = 0; i < path1.size() && i < path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        // Last equal node -> i-1th index
        return path1.get(i - 1);
    }

    
}

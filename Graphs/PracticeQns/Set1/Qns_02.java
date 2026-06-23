// Qns_02 : Find Minimum depth of binary tree Problem
// we have a binary tree , find its minimum depth. The minimum depth is the number of nodes along the sortest path from the root node down to the nearest leaf node.
// For example , minimum height of below binary tree is 2

// Sample input 1

/*      1
       /  \
      8    2
    / \    /
   6  5   9

*/

// Sample output : 3

import java.util.*;

public class Qns_02 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


    static int minDepth(Node root) {

        if (root == null)
            return 0;


        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int depth = 1;


        while (!q.isEmpty()) {

            int size = q.size();


            for (int i = 0; i < size; i++) {

                Node curr = q.remove();


                // leaf node found
                if (curr.left == null && curr.right == null) {
                    return depth;
                }


                if (curr.left != null)
                    q.add(curr.left);


                if (curr.right != null)
                    q.add(curr.right);
            }


            depth++;
        }


        return depth;
    }



    public static void main(String args[]) {


        /*
                 1
               /   \
              8     2
             / \    /
            6   5  9

        */


        Node root = new Node(1);

        root.left = new Node(8);
        root.right = new Node(2);

        root.left.left = new Node(6);
        root.left.right = new Node(5);

        root.right.left = new Node(9);



        System.out.print("Minimum Depth of Binary Tree is : ");
        System.out.print(minDepth(root));
    }
}
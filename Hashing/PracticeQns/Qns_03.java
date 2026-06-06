// Qns_03 : Bottom View of a Binary Tree
// The top view of a binary tree is the set of nodes visible when the tree is viewed from the top.
// given a binary tree, print the top view of it. The output nodes can be printed in any order.

// Sample input 
    //      20
    //     /  \
    //    8   22
    //  /  \   \
    // 5    3   25
    //     / \
    //    10 14

// Sample Output
// 5,10,3,14,25
// Use the concept of Verticle order    

package PracticeQns;

import java.util.*;

public class Qns_03 {

    static class Node {
        int data;
        int hd;
        Node left, right;

        public Node(int key) {
            this.data = key;
            this.hd = Integer.MAX_VALUE;
            this.left = this.right = null;
        }
    }

    public static void bottomViewHelper(Node root, int curr, int hd,
                                        TreeMap<Integer, int[]> map) {

        if (root == null)
            return;

        // If HD not present
        if (!map.containsKey(hd)) {
            map.put(hd, new int[]{root.data, curr});
        }
        // If current node is deeper
        else {
            int[] p = map.get(hd);

            if (p[1] <= curr) {
                p[1] = curr;
                p[0] = root.data;
            }

            map.put(hd, p);
        }

        bottomViewHelper(root.left, curr + 1, hd - 1, map);
        bottomViewHelper(root.right, curr + 1, hd + 1, map);
    }

    public static void printBottomView(Node root) {

        TreeMap<Integer, int[]> map = new TreeMap<>();

        bottomViewHelper(root, 0, 0, map);

        for (int[] val : map.values()) {
            System.out.print(val[0] + " ");
        }
    }

    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);

        root.left.left = new Node(5);
        root.left.right = new Node(3);

        root.right.left = new Node(4);
        root.right.right = new Node(25);

        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        System.out.println("Bottom View of Binary Tree:");
        printBottomView(root);
    }
}

// Qns_04 : Two Sum BST Problem
// Given a BST, transform it into a greater sum tree where each node containes sum of all nodes greater than that nodes.

package PracticeQns;

import java.util.ArrayList;

public class Qns_04 {
    // Node Class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // ArrayList to store pairs
    static ArrayList<String> pairs = new ArrayList<>();

    // Function to count pairs
    public static int countPairs(Node root1, Node root2, int x) {

        if (root1 == null || root2 == null) {
            return 0;
        }

        int count = 0;

        int target = x - root1.data;

        // If pair exists
        if (search(root2, target)) {
            count++;

            // Store pair
            pairs.add("(" + root1.data + ", " + target + ")");
        }

        // Traverse left subtree
        count += countPairs(root1.left, root2, x);

        // Traverse right subtree
        count += countPairs(root1.right, root2, x);

        return count;
    }

    // Search in BST
    public static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {

        /*
                BST 1
                    5
                  /   \
                 3     7
                / \   / \
               2  4  6   8

                BST 2
                    10
                  /    \
                 6      15
                / \    /  \
               3   8  11  18
        */

        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);

        root1.left.left = new Node(2);
        root1.left.right = new Node(4);

        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);

        root2.left.left = new Node(3);
        root2.left.right = new Node(8);

        root2.right.left = new Node(11);
        root2.right.right = new Node(18);

        int x = 16;

        int result = countPairs(root1, root2, x);

        System.out.println("Count of Pairs = " + result);

        System.out.println("Pairs are:");
        
        for (String pair : pairs) {
            System.out.println(pair);
        }
    }
}

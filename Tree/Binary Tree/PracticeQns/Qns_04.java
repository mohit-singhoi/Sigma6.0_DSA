// Qns_04 : Find All Duplicate Subtrees in a Binary Tree
// We have a binary tree, find all duplicates subtrees in the given binary tree. A duplicate subtree is a subtree that appears more than once in the binary tree. For each duplicate subtree, we only need to return the root node of any one of them. Two tree are duplicates if they have the same structure with the same node values.
package PracticeQns;

import java.util.*;

public class Qns_04 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static HashMap<String, Integer> map = new HashMap<>();
    static List<Node> result = new ArrayList<>();

    public static String findDuplicates(Node root) {
        if (root == null) {
            return "#"; // marker for null
        }

        // Serialize subtree
        String left = findDuplicates(root.left);
        String right = findDuplicates(root.right);

        String subtree = root.data + "," + left + "," + right;

        // Count frequency
        map.put(subtree, map.getOrDefault(subtree, 0) + 1);

        // If frequency becomes 2 → duplicate found
        if (map.get(subtree) == 2) {
            result.add(root);
        }

        return subtree;
    }

    public static void main(String[] args) {


            /* Example Tree:
            *       1
            *     /   \
            *    2    3
            *   / \   / \
            *   4 5   6   5
            *  /       /  \  \
            * 5      4   4  5
            *   
            * 
            * Duplicate Subtrees:
            * Subtree rooted at node with value 4 (appears twice)
            * Subtree rooted at node with value 5 (appears twice)
            */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(5);
        root.left.right.left = new Node(4);
        root.right.right.left = new Node(4);
        root.right.right.right = new Node(5);

        findDuplicates(root);

        // Print duplicate subtree roots
        System.out.print("Duplicate Subtree Roots : ");
        for (Node node : result) {
            System.out.print(node.data + " ");
        }
        System.out.println(); 
    }
}
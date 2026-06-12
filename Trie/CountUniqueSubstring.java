// Count Unique Substring
// Given a string of length n, the task is to count all unique substrings of the given string. A substring is a contiguous sequence of characters within a string.

public class CountUniqueSubstring {
    static class Node {
        Node[] children = new Node[26];
        boolean isEndOfWord;

        Node() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    public static  Node root = new Node();

    public static void insert(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.isEndOfWord = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int index = key.charAt(level) - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr.isEndOfWord;
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1; // Count the current node
    }

    public static void main(String[] args) {
        String str = "ababa"; // ans = 10

        //Suffix  -> insert in trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        // Count the number of nodes in the trie
        int uniqueSubstrings = countNodes(root); // Subtract 1 to exclude the root node
        System.out.println("Number of unique substrings: " + uniqueSubstrings);
    }


    
}

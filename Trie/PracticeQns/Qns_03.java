// Qns_02 :Longest word in Dictionary
// Given an array of strings words representing an English Dictionary,
// return the longest word in words that can be built one character at a time
// by other words in words.

//If there is more than one possible answer, return the longest word with
// the smallest lexicographical order. If there is no answer, return the empty string.

// Note that the word should be built from left to right, with each additional
// character being added to the end of a previous word.

// Sample Input:
// words = ["w","wo","wor","worl","world"]
//
// Sample Output:
// "world"

// Explanation:
// "world" can be built one character at a time as:
// "w" → "wo" → "wor" → "worl" → "world"

package PracticeQns;

public class Qns_03 {

    private static class Node {
        char data;
        String word;
        boolean isEnd;
        Node[] children;

        Node(char data) {
            this.data = data;
            this.word = null;
            this.isEnd = false;
            this.children = new Node[26];
        }
    }

    private Node root = new Node('/');
    private String ans = "";

    // Insert a word into Trie
    private void insert(String word) {

        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node(word.charAt(i));
            }

            curr = curr.children[idx];
        }

        curr.isEnd = true;
        curr.word = word;
    }

    // DFS Traversal
    private void dfs(Node node) {

        if (node == null) {
            return;
        }

        if (node.word != null) {

            if (node.word.length() > ans.length()) {
                ans = node.word;
            } else if (node.word.length() == ans.length()
                    && node.word.compareTo(ans) < 0) {
                ans = node.word;
            }
        }

        for (Node child : node.children) {

            // Move only if prefix itself is a valid word
            if (child != null && child.word != null) {
                dfs(child);
            }
        }
    }

    public String longestWord(String[] words) {

        for (String word : words) {
            insert(word);
        }

        dfs(root);

        return ans;
    }

    public static void main(String[] args) {

        Qns_03 obj = new Qns_03();

        String[] words1 = {
                "w", "wo", "wor", "worl", "world"
        };

        System.out.println("Answer : " +
                obj.longestWord(words1));

        Qns_03 obj2 = new Qns_03();

        String[] words2 = {
                "a", "banana", "app",
                "appl", "ap", "apply", "apple"
        };

        System.out.println("Answer : " +
                obj2.longestWord(words2));
    }
}

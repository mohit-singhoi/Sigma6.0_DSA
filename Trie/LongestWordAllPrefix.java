// Longest word with all prefix
// Given an array of strings words, find the longest string in words such that every prefix of it is also in words.

public class LongestWordAllPrefix {
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

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for(int i =0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].isEndOfWord == true) {
                char ch = (char)(i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }


    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"}; // ans = apple

        for (String word : words) {
            insert(word);
        }

        longestWord(root, new StringBuilder());
        System.out.println("Longest word with all prefixes: " + ans);


    }
    
}

// Find shortest unique prefix for every word in a given list of words. Assume that no word is prefix of another.

public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;

            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(String word, String ans, int idx) {
        if (idx == word.length()) {
            System.out.println(ans);
            return;
        }
        int i = word.charAt(idx) - 'a';
        if (root.children[i].freq == 1) {
            ans += word.charAt(idx);
            System.out.println(ans);
            return;
        }
        findPrefix(word, ans + word.charAt(idx), idx + 1);
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };

        // Insert all words into the Trie.
        for (String word : arr) {
            insert(word);
        }

        root.freq = -1; // Set the frequency of the root to -1 to avoid counting it as a prefix.
        

    }

}

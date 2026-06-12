// Qns_01 : Group Anangram Together
// Given an array of strings strs, group the anagrams together. You can return the answer in any order. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


// Sample Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Sample Output: [["bat"],["nat","tan"],["ate","eat","tea"]]


package PracticeQns;

import java.util.*;

class TrieNode {
    List<String> data;
    TrieNode[] children;
    boolean isEnd;

    TrieNode() {
        data = new ArrayList<>();
        children = new TrieNode[26];
        isEnd = false;
    }
}

public class Qns_01 {

    static TrieNode root;
    static List<List<String>> ans;

    public static List<List<String>> groupAnagrams(String[] strs) {

        root = new TrieNode();
        ans = new ArrayList<>();

        for (String word : strs) {
            insert(word);
        }

        dfs(root);

        return ans;
    }

    public static void insert(String s) {

        TrieNode curr = root;

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        for (char ch : arr) {

            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }

            curr = curr.children[idx];
        }

        curr.isEnd = true;
        curr.data.add(s);
    }

    public static void dfs(TrieNode node) {

        if (node == null) {
            return;
        }

        if (node.isEnd) {
            ans.add(node.data);
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                dfs(node.children[i]);
            }
        }
    }

    public static void main(String[] args) {

        String[] strs = {
                "eat", "tea", "tan",
                "ate", "nat", "bat"
        };

        List<List<String>> result = groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}

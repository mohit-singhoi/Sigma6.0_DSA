// Qns_04 : Alien Dictionary Problem Shorter Version
// We have a sorted dictionary of an alien language having n words and k starting alphabets of standard dictionary. Find the order of charcaters in the alien language. Many orders may be possible for a particular test case, thus you may return any valid order and output will be 1 if the order of stringreturned by the function is correct else 0 denoting incorrect string returned.

// Sample input 1
// N = 3, K =3
// dict = {"caa", "aaa", "aab"}
// Sample output 1 : "cab" : 1

// Sample input 2
// N = 5, K =4
// dict = {"baa", "abcd", "abca", "cab", "cad"}
// Sample output 2 : "bdac" : 1

import java.util.*;

public class Qns_04_1 {

    // O(n + k) time complexity, where n is the number of words and k is the number of unique characters
    public static String alienOrder(String[] words) {

        HashMap<Character, HashSet<Character>> graph = new HashMap<>();
        HashMap<Character, Integer> indegree = new HashMap<>();

        // Add all characters
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                indegree.putIfAbsent(ch, 0);
            }
        }

        // Build graph
        for (int i = 0; i < words.length - 1; i++) {

            String w1 = words[i];
            String w2 = words[i + 1];

            int len = Math.min(w1.length(), w2.length());

            for (int j = 0; j < len; j++) {

                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);

                if (c1 != c2) {

                    graph.putIfAbsent(c1, new HashSet<>());

                    if (!graph.get(c1).contains(c2)) {
                        graph.get(c1).add(c2);
                        indegree.put(c2, indegree.get(c2) + 1);
                    }
                    break;
                }
            }
        }

        Queue<Character> q = new LinkedList<>();

        for (char ch : indegree.keySet()) {
            if (indegree.get(ch) == 0)
                q.offer(ch);
        }

        StringBuilder ans = new StringBuilder();

        while (!q.isEmpty()) {

            char curr = q.poll();
            ans.append(curr);

            if (graph.containsKey(curr)) {

                for (char next : graph.get(curr)) {

                    indegree.put(next, indegree.get(next) - 1);

                    if (indegree.get(next) == 0)
                        q.offer(next);
                }
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) { 

        String words[] = {"baa", "abcd", "abca", "cab", "cad"};

        System.out.println("Output: " + alienOrder(words));
    }
}

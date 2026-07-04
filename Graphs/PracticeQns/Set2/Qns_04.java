// Qns_04 : Alien Dictionary Problem
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

public class Qns_04 {

    public String alienOrder(String[] words) {

        // Graph : Character -> Neighbors
        Map<Character, Set<Character>> graph = new HashMap<>();

        // Indegree of each character
        Map<Character, Integer> indegree = new HashMap<>();

        // Step 1: Add all unique characters
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                indegree.putIfAbsent(ch, 0);
            }
        }

        // Step 2: Build Graph
        for (int i = 0; i < words.length - 1; i++) {

            String curr = words[i];
            String next = words[i + 1];

            // Invalid case:
            // Example: "abc" comes before "ab"
            if (curr.length() > next.length() && curr.startsWith(next)) {
                return "";
            }

            int len = Math.min(curr.length(), next.length());

            for (int j = 0; j < len; j++) {

                char c1 = curr.charAt(j);
                char c2 = next.charAt(j);

                if (c1 != c2) {

                    graph.putIfAbsent(c1, new HashSet<>());

                    // Avoid duplicate edges
                    if (!graph.get(c1).contains(c2)) {
                        graph.get(c1).add(c2);
                        indegree.put(c2, indegree.get(c2) + 1);
                    }

                    // Only first different character matters
                    break;
                }
            }
        }

        // Step 3: Topological Sort (Kahn's Algorithm)
        Queue<Character> queue = new LinkedList<>();

        for (char ch : indegree.keySet()) {
            if (indegree.get(ch) == 0) {
                queue.offer(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!queue.isEmpty()) {

            char curr = queue.poll();
            ans.append(curr);

            if (graph.containsKey(curr)) {

                for (char neighbor : graph.get(curr)) {

                    indegree.put(neighbor, indegree.get(neighbor) - 1);

                    if (indegree.get(neighbor) == 0) {
                        queue.offer(neighbor);
                    }
                }
            }
        }

        // Step 4: Cycle Detection
        if (ans.length() != indegree.size()) {
            return "";
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Qns_04 obj = new Qns_04();

        // Test Case 1
        String[] words1 = {"caa", "aaa", "aab"};
        System.out.println("Test Case 1: " + obj.alienOrder(words1));
        // Output: cab

        // Test Case 2
        String[] words2 = {"baa", "abcd", "abca", "cab", "cad"};
        System.out.println("Test Case 2: " + obj.alienOrder(words2));
        // Output: bdac (or another valid order)

        // Test Case 3 (Invalid Prefix)
        String[] words3 = {"abc", "ab"};
        System.out.println("Test Case 3: " + obj.alienOrder(words3));
        // Output: ""

        // Test Case 4 (Single Word)
        String[] words4 = {"abcd"};
        System.out.println("Test Case 4: " + obj.alienOrder(words4));
        // Output: abcd (or any order of its unique characters)

        // Test Case 5 (Cycle Example)
        String[] words5 = {"z", "x", "z"};
        System.out.println("Test Case 5: " + obj.alienOrder(words5));
        // Output: ""
    }
}

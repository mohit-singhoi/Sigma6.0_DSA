package PracticeQns;

import java.util.*;

public class Qns_05_1 {

    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue()
                );

        pq.addAll(map.entrySet());

        StringBuilder res = new StringBuilder();

        while (!pq.isEmpty()) {

            Map.Entry<Character, Integer> curr = pq.poll();

            char ch = curr.getKey();
            int freq = curr.getValue();

            while (freq-- > 0) {
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {

        String s = "cccaaa";

        System.out.println("Original String : " + s);
        System.out.println("Sorted String   : " + frequencySort(s));
    }
}
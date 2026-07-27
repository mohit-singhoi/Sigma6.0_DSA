// Count Unique Substring   
// Given a string s, return the number of unique substrings in s.

import java.util.*;
public class CountUniqueSubstring {
    public int countUniqueSubstrings(String s) {
        int n = s.length();
        HashSet<String> uniqueSubstrings = new HashSet<>();

        // Generate all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);
                uniqueSubstrings.add(substring);
            }
        }

        return uniqueSubstrings.size();
    }

    public static void main(String[] args) {
        CountUniqueSubstring solution = new CountUniqueSubstring();
        String s = "abc";
        int result = solution.countUniqueSubstrings(s);
        System.out.println("Number of unique substrings in \"" + s + "\": " + result);
    }
    
}

// Longest Substring Without Repeating Characters : Leetcode 3

// Given a string s, find the length of the longest substring without duplicate characters.
// The Traveler's Unique Path: Avoiding Repetition A traveler explores a city, aiming to visit as many unique locations as possible without repetition.
// If they revisit a place, they backtrack and choose a new path. This mirrors the longest substring without repeating characters problem, where each location represents a unique character. 
// By using the sliding window technique, we efficiently track the longest unique path.

// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

// Example 2:
// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

import java.util.*;
public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println("Length of Longest Substring Without Repeating Characters in \"" + s1 + "\": " + lengthOfLongestSubstring(s1));

        String s2 = "bbbbb";
        System.out.println("Length of Longest Substring Without Repeating Characters in \"" + s2 + "\": " + lengthOfLongestSubstring(s2));
    }

    
}

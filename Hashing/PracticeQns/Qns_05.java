// Qns_05 : sort by frequency problem
// Given a string s, sort it in decreasing order based on the frequency of its characters. 
// The frequency of a character is the number of times it appears in the string. Characters with higher frequency should appear before characters with lower frequency, and all occurrences of the same character must be grouped together. 
// If multiple characters have the same frequency, return any valid ordering.

// Sample Input 1
// s = "tree"
// Sample Output    
// "eert" (because 'e' appears twice while 'r' and 't' both appear once, so 'e' must appear before both 'r' and 't'. "

// Sample Input 2
// s = "cccaaa"
// Sample Output
// "aaaccc" (both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid outputs. Note that "cacaca" is incorrect, as the same characters must be together.)

package PracticeQns;

public class Qns_05 {
    public static String frequencySort(String s) {
        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                for (int j = 0; j < freq[i]; j++) {
                    sb.append((char) i);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "tree";
        System.out.println(" Output : " + frequencySort(s1));

        String s2 = "cccaaa";
        System.out.println(" Output : " + frequencySort(s2));
    }
    
}

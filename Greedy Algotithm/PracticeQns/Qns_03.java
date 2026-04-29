// Qns_03.java
// Lexicographically smallest string of length N and Sum k.
// We have 2 variable N and K, the task is to find the lexicographically smallest string of length N and sum of its characters is K. The string should only contain lowercase letters from 'a' to 'z'. The value of each character is defined as follows: 'a' has a value of 1, 'b' has a value of 2, ..., and 'z' has a value of 26. If there is no such string, return an empty string.
// Example 1:
// Input: N = 3, K = 27
// Output: "aay"
// Explanation: The lexicographically smallest string of length 3 and sum of its characters is 27 is "aay". The value of 'a' is 1 and the value of 'y' is 25, so the sum of the characters in "aay" is 1 + 1 + 25 = 27.
// Example 2:
// Input: N = 5, K = 73
// Output: "aaszz"
// Explanation: The lexicographically smallest string of length 5 and sum of its characters is 73 is "aaszz". The value of 'a' is 1 and the value of 's' is 19 and the value of 'z' is 26, so the sum of the characters in "aaszz" is 1 + 1 + 19 + 26 + 26 = 73.
// Example 3:
// Input: N = 5, K = 42
// Output: "aamz"
// Explanation: The lexicographically smallest string of length 5 and sum of its characters is 42 is "aamz". The value of 'a' is 1 and the value of 'm' is 13 and the value of 'z' is 26, so the sum of the characters in "aamz" is 1 + 1 + 13 + 26 + 1 = 42.

import java.util.*;
public class Qns_03 {
    public static String getSmallestString(int n, int k){
        char[] ans = new char[n];
        // Initially fill the string with 'a' and then we will add the remaining value to the last character of the string until we reach the required sum k.
        Arrays.fill(ans, 'a');

        // Remaining value to be added to the string after filling it with 'a' is k - n because we have already filled the string with 'a' which has a value of 1 and there are n characters in the string, so the total value of the string is n. Now we need to add the remaining value k - n to the last character of the string until we reach the required sum k.
        k -= n;

        // Fill the string from the end to the beginning until we reach the required sum k. We will add the remaining value to the last character of the string until we reach the required sum k. The maximum value of a character is 26, so we will add the minimum of 25 and k to the last character of the string because we have already filled the string with 'a' which has a value of 1, so we can only add 25 to it to reach the maximum value of 26. We will continue this process until we reach the required sum k or we have filled all the characters in the string.
        for(int i = n - 1; i >= 0 && k > 0; i--){
            int add = Math.min(25, k);
            ans[i] += add;
            k -= add;
        }
        return new String(ans);
    }

    // Main Fun
    public static void main(String[] args) {
        int N = 5, K = 42;
        String ans = getSmallestString(N, K);
        System.out.println("Lexicographically smallest string of length " + N + " and sum " + K + " is : " + ans);
    }
  
    
}

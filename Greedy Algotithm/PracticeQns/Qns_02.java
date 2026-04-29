// Qns_02.java
// Kth Largest odd number in a given range
// We have 2 variable L and R , indicating a range of integers from L to R (inclusive) and a variable K, the task is to find the Kth largest odd number in the given range. If there are less than K odd numbers in the given range, then return 0.
// Example 1:
// Input: L = 3, R = 11, K = 2
// Output: 9
// Explanation: The odd numbers in the given range are 3, 5, 7, 9, 11. The 2nd largest odd number is 9.
// Example 2:
// Input: L = -3, R = 3, K = 1
// Output: 3
// Explanation: The odd numbers in the given range are -3, -1, 1, 3. The 1st largest odd number is 3.

public class Qns_02 {
    public static void main(String[] args) {
        int L = 3, R = 11, K = 2;
        int count = 0;
        int ans = 0;

        for (int i = R; i >= L; i--) {
            if (i % 2 != 0) {
                count++;
                if (count == K) {
                    ans = i;
                    break;
                }
            }
        }
        System.out.println("Kth Largest odd number in a given range : " + ans);
    }

    
}

// Qns_01.java
// Maximum balanced String Partitions
// We have balanced string str of size N with the equal number of L and R, the task is to find a maximum number of x balanced substring.
// A string is balanced if it has an equal number of L and R characters.
// Example 1:
// Input: str = "RLRRLLRLRL"
// Output: 4
// Explanation: str can be split into "RL", "RRLL", "RL", "RL", each substring contains equal number of L and R.
// Example 2:
// Input: str = "RLLLLRRRLR"
// Output: 3
// Explanation: str can be split into "RL", "LLLRRR", "LR",

package PracticeQns;

public class Qns_01 {
    public static void main(String[] args) {
        String str = "RLRRLLRLRL";
        int count = 0;
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'R') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ans++;
            }
        }
        System.out.println("Maximum balanced String Partitions : " + ans);
    }
    
}

// Qns_05_2 : Number of Parenthesis Combinations
// Given N numbers of parenthesis (pair of opening and closing parenthesis), you  have to count all the void combinations of the parenthesis.

// Input : n = 4
// Output : 14

//Following 14 combinations
// {
// (((()))), ((())), ((())(), ((()))(), (()(())), (()()())
// (()()), (())(), ()(()), ()()(), ()((())), ()(()())
// ()()(()), ()()()()
// }

public class Qns_05_2 {

    static int ans = 0;

    public static int helper(int left, int right) {

        if (left == 0 && right == 0) {
            ans++;
            return ans;
        }

        // Invalid state
        if (left > right) {
            return 0;
        }

        // Place '('
        if (left > 0) {
            helper(left - 1, right);
        }

        // Place ')'
        if (right > 0) {
            helper(left, right - 1);
        }

        return ans;
    }

    public static int countWays(int n) {

        // If n is odd, no valid parentheses
        if ((n & 1) != 0) {
            return 0;
        }

        ans = 0; // Reset for multiple test cases
        return helper(n / 2, n / 2);
    }

    public static void main(String[] args) {

        int n = 8; // Total parentheses = 8 (4 opening + 4 closing)

        System.out.println("Number of Valid Combinations = " + countWays(n));
    }
}
// Qns_05 : Number of Parenthesis Combinations
// Given N numbers of parenthesis (pair of opening and closing parenthesis), you  have to count all the void combinations of the parenthesis.

// Input : n = 4
// Output : 14

//Following 14 combinations
// {
// (((()))), ((())), ((())(), ((()))(), (()(())), (()()())
// (()()), (())(), ()(()), ()()(), ()((())), ()(()())
// ()()(()), ()()()()
// }

// Catalan Number using Dynamic Programming (Tabulation)

public class Qns_05 {

    public static int countParenthesis(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = 0;

            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println("Number of Valid Parenthesis Combinations = "
                + countParenthesis(n));
    }
}
// Qns_02 : Print all combinations of balanced parentheses
// write a function to generate all possible n pairs of balanced parentheses.

// Input : n=1
// Output : {}

// Input : n = 2
// Output : {}{} {{}}

public class Qns_02 {

    public static void generate(int open, int close, int n, String ans) {

        if (open == n && close == n) {
            System.out.println(ans);
            return;
        }

        if (open < n) {
            generate(open + 1, close, n, ans + "{");
        }

        if (close < open) {
            generate(open, close + 1, n, ans + "}");
        }
    }

    public static void main(String[] args) {
        int n = 2;
        generate(0, 0, n, "");
    }
}
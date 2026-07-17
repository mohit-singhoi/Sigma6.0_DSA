// String Conversion Problem 
// convert string 1 to string 2 with only using insertion & deletion.
//print the total no of deletion and insertion
// str1 = "pear" , str2 = "sea"
// using Calculating lcs length


public class StrConversion {

    // Function to find LCS length
    public static int lcs(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];

        // Tabulation
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    // O(n * m)
    public static void stringConversion(String str1, String str2) {

        int lcsLength = lcs(str1, str2);

        int deletion = str1.length() - lcsLength;
        int insertion = str2.length() - lcsLength;

        System.out.println("LCS Length : " + lcsLength);
        System.out.println("Deletion   : " + deletion);
        System.out.println("Insertion  : " + insertion);
        System.out.println("Total Operations : " + (deletion + insertion));
    }

    public static void main(String[] args) {

        String str1 = "pear";
        String str2 = "sea";

        stringConversion(str1, str2);
    }
}

// WildCard matching Problem
//given a text and a wild card pattern , implement wildcard matching algorithm that finds if wildcard pattern is matched with text.
// The matching should cover the entire text(not partial text).
// Wild card pattern can include the characters  '?' and '*'

// '?' : Match any single character
// '*' : matches any sequence of characters (including the empty sequence)

//Ex :
// Text = "baaabab"
// Pattern = "*****ba*****ab"
// Output : true

// Text = "baaabab"
// Pattern = "a*ab"
// False

public class WildcardMatching {
    public static boolean isMatch(String s, String p){
        int n = s.length();
        int m = p.length();

        boolan dp[][] = new boolean[n+1][m+1];

        //initialize
        dp[0][0] = true;
        //pattern = " "
        for(int i =1;i<n+1;i++){
            dp[i][0] = false;
        }

        //s = " "
        for(int j =1;j<m+1;j++){
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }

        //bottom up
        
    }

    public static void main(String args[]) {
        String s = "baaabab";
        String p = "*****ba*****ab"; //true

    }

}

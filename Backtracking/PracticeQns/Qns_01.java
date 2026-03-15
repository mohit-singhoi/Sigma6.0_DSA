// WAP to find all the subsets of a given set of characters using stringBuilder and backtracking.

package PracticeQns;

public class Qns_01 {
    public static void findSubsets(String str, StringBuilder ans , int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
                return;
            }else{
            System.out.println(ans);
            }
            return;
        }

        // recursion
        //yes
        ans.append(str.charAt(i));
        findSubsets(str, ans, i+1);
        ans.deleteCharAt(ans.length()-1);
        //no
        findSubsets(str, ans, i+1);
    }

    // Main Function
    public static void main(String[] args) { //TC O(2^n*n) SC O(n)
        String str = "abc";
        System.out.println("Total Subsets are : ");
        findSubsets(str, new StringBuilder(""), 0);
    }
    
}

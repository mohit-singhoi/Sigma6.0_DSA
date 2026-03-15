package PracticeQns;
// WAP to find all the permutations of a given string using backtracking.

public class Qns_02 {
    public static void findPermutation(String str, String ans, int i){
        // base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int j=0; j<=ans.length(); j++){
            findPermutation(str, ans.substring(0, j) + str.charAt(i) + ans.substring(j), i+1);
        }
    }

    // Main Function
    public static void main(String[] args) { //TC O(n*n!) SC O(n)
        String str = "abc";
        System.out.println("Total Permutations are : ");
        findPermutation(str, "", 0);  
    }

    
}

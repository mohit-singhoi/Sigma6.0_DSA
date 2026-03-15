// WAP to find the permutations of a given string using backtracking.

public class FindPermutation {
    public static void findPermutation(String str, String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(NewStr, ans + currChar);
        }
    }

    // Main Function
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Total Permutations are : ");
        findPermutation(str, "");
    }
    
}

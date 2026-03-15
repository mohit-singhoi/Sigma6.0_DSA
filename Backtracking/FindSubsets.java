// Given an integer array nums of unique elements, return all possible subsets (the power set).
public class FindSubsets {
    public static void findSubsets(String str, String ans , int i){
        // base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
                return;
            }
            System.out.println(ans);
            return;
        }

        // recursion
        //yes
        findSubsets(str, ans + str.charAt(i), i+1);
        //no
        findSubsets(str, ans, i+1);
    }


    // Main Function
    public static void main(String[] args) { //TC O(2^n) SC O(n)
        String str = "abc";
        System.out.println("Total Subsets are : ");
        findSubsets(str, "", 0);  
    }  

}

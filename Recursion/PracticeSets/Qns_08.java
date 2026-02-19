// Question 8 : We are given a String  S , we need to find the count of all contiguous substrings starting and ending with the same character.
// Sample Input: S = "abcab"
// Sample Output: 7
// Explanation: The substrings are "a", "b", "c", "a", "b", "abca", "bcab".

package PracticeSets;

public class Qns_08 {
    public static int countSubstrings(String str , int index){
        // Base case
        if(index == str.length()){
            return 0;
        }

        // Recursive case
        int count = 0;
        for(int j = index; j < str.length(); j++){
            if(str.charAt(index) == str.charAt(j)){
                count++;
                System.out.println("Found substring: " + str.substring(index, j + 1));
            }
        }

        return count + countSubstrings(str, index + 1);
    }

    // Main function
    public static void main(String[] args) {
        String str = "abcab";
        int result = countSubstrings(str, 0);
        System.out.println("The count of all contiguous substrings starting and ending with the same character is: " + result);
    }
}

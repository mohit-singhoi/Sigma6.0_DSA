// WAP to find the length of String using recursion.

package PracticeSets;

public class Qns_07 {
    public static int findLength(String str , int index){

        // // 1st way
        // // Base case
        // if(str.equals("")){
        //     return 0;
        // }

        // // Recursive case
        // return 1 + findLength(str.substring(1));


        // 2nd way
        // Base case
        if(index == str.length()){
            return 0;
        }
        return 1 + findLength(str, index + 1);
    }

    // Main function
    public static void main(String[] args) {
        String str = "Hello World";
        int length = findLength(str, 0);
        System.out.println("The length of the string \"" + str + "\" is: " + length);
    }

        
}

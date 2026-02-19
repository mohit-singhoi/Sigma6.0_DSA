// Question 5: For a given integer array of size N.
//  You have to find all the occurences(indices) of a given element (key) and print them. Use a recursive function to solve this problem.
// Sample Input: arr = [1, 2, 3, 2, 4], key = 2
// Sample Output: 1 3
package PracticeSets;

public class Qns_05 {
    public static void findOccurences(int arr[] , int key , int index){
        // Base case
        if(index == arr.length){
            return;
        }

        // Recursive case
        if(arr[index] == key){
            System.out.print(index + " ");  
        }

        // Recursive call for next Index
        findOccurences(arr, key, index+1);

    }
    
    // Main function
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4};
        int key = 2;

        System.out.println("Total Occurences of " + key + " are at indices: ");
        findOccurences(arr, key, 0);
    }
}

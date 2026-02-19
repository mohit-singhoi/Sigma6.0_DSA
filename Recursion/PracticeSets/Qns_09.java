// Tower of Hanoi : You have 3 rods and N disks. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
    // 1. Only one disk can be moved at a time.
    // 2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
    // 3. No disk may be placed on top of a smaller disk.
    // Sample Input: N = 2
    // Sample Output: Move disk 1 from rod A to rod B
    //                 Move disk 2 from rod A to rod C
    //                 Move disk 1 from rod B to rod C

package PracticeSets;

public class Qns_09 {
    static int count = 0;
    public static void towerOfHanoi(int n , char fromRod , char toRod , char auxRod){
       
        // Base case
        if(n == 0){
            return;
        }

        // Recursive case
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        count++;
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
        
    }

    // Main function
    public static void main(String[] args) {
        int n = 3; // Number of disks
        System.out.println("The sequence of moves for " + n + " disks is:");
        
        towerOfHanoi(n, 'A', 'C', 'B'); // A is the source rod, C is the destination rod, and B is the auxiliary rod
        System.out.println("Total number of moves: " + count);  
    }
}

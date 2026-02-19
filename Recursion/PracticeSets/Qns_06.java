// You have been given a Number ( e.g - 2019 ), convert it into a String of english like "Two Zero One Nine". Use a recursive function to solve this problem.

package PracticeSets;

public class Qns_06 {
    public static void convertToString(int num){
        // Base case
        if(num == 0){
            return;
        }

        // Recursive case
        int lastDigit = num % 10;
        convertToString(num / 10);

        // Print the last digit in words
        switch(lastDigit){
            case 0: System.out.print("Zero "); break;
            case 1: System.out.print("One "); break;
            case 2: System.out.print("Two "); break;
            case 3: System.out.print("Three "); break;
            case 4: System.out.print("Four "); break;
            case 5: System.out.print("Five "); break;
            case 6: System.out.print("Six "); break;
            case 7: System.out.print("Seven "); break;
            case 8: System.out.print("Eight "); break;
            case 9: System.out.print("Nine "); break;
        }
    }

    // Main function
    public static void main(String[] args) {
        int num = 2019;
        System.out.println("The number " + num + " in words is: ");
        convertToString(num);
    }
}

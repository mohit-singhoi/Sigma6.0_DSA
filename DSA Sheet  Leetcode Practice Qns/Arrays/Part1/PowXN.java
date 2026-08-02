// Pow(x, n) problem LeetCode 50
// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

// Example 1:
// Input: x = 2.00000, n = 10
// Output: 1024.00000

// Example 2:
// Input: x = 2.10000, n = 3
// Output: 9.26100

// Example 3:
// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25

public class PowXN {
// Approach 1: Using built-in Math.pow function

// Function to calculate x raised to the power of n
   public static double myPow(double x, int n) {
       return Math.pow(x, n);  // Use the built-in Math.pow function
   }


   // Approach 2
     // Helper method for exponentiation by squaring
   public static double helper(double x, int n) {
       if (n == 0) return 1; // Base case: x^0 = 1
       double temp = helper(x, n / 2); // Recursively compute x^(n/2)
       temp *= temp; // Square the result
       if (n % 2 != 0) temp *= x; // If odd, multiply by x
       return temp;
   }


   public static  double myPow1(double x, int n) {
       if (n < 0) {
           long val = (long) n; // Convert to long to handle edge cases
           double ans = helper(x, (int) -val); // Compute for positive exponent
           return 1.0 / ans; // Return reciprocal for negative exponent
       }
       return helper(x, n);
   }


   // Main function to test the myPow function
   public static void main(String[] args) {
      // Solution solution = new Solution();  // Create an instance of Solution
       double x = 2.0;  // Base value
       int n = 10;  // Exponent value
       System.out.println("Result: " + myPow(x, n));  // Print the result
       System.out.println("Result : " +myPow1(x, n));
   }
    
    
}

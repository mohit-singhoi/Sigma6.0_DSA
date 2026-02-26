<<<<<<< HEAD
// Maximum SubArray sum using divide and conquer approach

public class Qns_04 {

    // Main function
    public static int maxSubArray(int[] arr, int left, int right) {
        // Base case
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;

        // Recursively find left and right maximum
        int leftMax = maxSubArray(arr, left, mid);
        int rightMax = maxSubArray(arr, mid + 1, right);

        // Find crossing sum
        int crossMax = maxCrossingSum(arr, left, mid, right);

        // Return maximum of three
        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    // Function to find maximum crossing sum
    public static int maxCrossingSum(int[] arr, int left, int mid, int right) {

        int sum = 0;
        int leftSum = Integer.MIN_VALUE;

        // Include elements on left of mid
        for (int i = mid; i >= left; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;

        // Include elements on right of mid
        for (int i = mid + 1; i <= right; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(arr, 0, arr.length - 1);
        System.out.println("Maximum Subarray Sum: " + result);
    }
=======
public class Qns_04{
 public static void main(String[] args){
 System.out.println("Example 4");
}
>>>>>>> 3ebd9febf2ac3eaf13b88cd7658228421364705c
}
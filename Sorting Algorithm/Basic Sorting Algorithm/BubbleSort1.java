//WAP to sort array using Bubble sort algorithm
// Time complexity is : O(n) in best case , O(n^2) in Avg & worst Case

public class BubbleSort1 {
    public static void bubbleSort1(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void printNums(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+" ");

        }
    }

    public static void main(String[] args) {
        int nums[] ={8,5,9,1,6,0};
        System.out.print("Sorted Array is : \n");
        bubbleSort1(nums);
        printNums(nums);
    }

}

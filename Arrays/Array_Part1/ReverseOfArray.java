public class ReverseOfArray {
    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp;

            // Swap first to last value
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 8, 87, 9, 25, 23, 4, 56, 21 };

        System.out.println("Original Array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
        reverseArray(arr);
        System.out.println("\n\nReversed Array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + " ");
        }
    }
}

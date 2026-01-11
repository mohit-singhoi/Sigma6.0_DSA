public class SumofSubarray {

    public static void printSubArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int sum = 0;   // reset for each subarray
                System.out.print("Subarray (");

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    sum += arr[k];

                    if (k < j) {
                        System.out.print(", ");
                    }
                }

                System.out.println(") = " + sum);
            }
            System.out.println();
        }

        int ts = arr.length * (arr.length + 1) / 2;
        System.out.println("Total number of Subarray is : " + ts);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArray(arr);
    }
}

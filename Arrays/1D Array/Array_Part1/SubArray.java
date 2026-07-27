
public class SubArray {
    public static void printSubArray(int arr[]) {
       // int ts=0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                System.out.print("(");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]+" "); // print all sub array from start to end 
                    

                }
                System.out.print(")");
                System.out.println();
                //ts++;

            }
            System.out.println();

        }
        int ts=arr.length*(arr.length+1)/2;
        System.out.println("Total number of Subarray is : " +ts);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArray(arr);
    }

}
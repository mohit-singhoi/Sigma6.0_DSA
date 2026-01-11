package Array_Part2;

public class PairsOfArray {
    public static void pairsOfArray(int arr[][]) {

        int len = arr.length * arr[0].length;
        // Convert 2D to 1D
        for (int i = 0; i < len; i++) {
            int div = i / arr[0].length; // Performinteger divisor
            int rem = i % arr[0].length; // Finding remainder

            for (int j = i + 1; j < len; j++) {
                int div1 = j / arr[0].length; // Performinteger divisor
                int rem1 = j % arr[0].length; // Finding remainder

                System.out.print("(" + arr[div][rem] + "," + arr[div1][rem1] + ")\t");
            }
            System.out.println();
          

        }
          int tp = len*(len-1)/2;
          System.out.println("Total number of Pairs :"+ tp);

    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        pairsOfArray(arr);
    }
}

public class Qns_01 {

    public static String largestStr(String arr[]) {

        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest.compareToIgnoreCase(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        String names[] = {"Ankit Raj","Dipak","Mohit","Amit","Abhishek","Raja","Ankit"};

        System.out.println("Largest String is : " + largestStr(names));
    }
}

package PracticeQns;
import java.util.*;

public class Qns_01 {
    public static void main(String[] args) {

        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        int start = -1;
        int end = -1;

        // Important: sum 0 occurs before array starts
        map.put(0, -1);

        for (int j = 0; j < arr.length; j++) {

            sum += arr[j];

            if (map.containsKey(sum)) {

                int len = j - map.get(sum);

                if (len > maxLen) {
                    maxLen = len;
                    start = map.get(sum) + 1;
                    end = j;
                }

            } else {
                map.put(sum, j);
            }
        }

        System.out.println("Length = " + maxLen);

        System.out.print("Subarray = [ ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
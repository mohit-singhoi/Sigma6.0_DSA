
public class DistinctEleBruteForce {


    public static int countDistinct(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                        isDistinct = false;
                        break;
                    }
                }
                if (isDistinct) {
                    count++;
                }
            }
            return count;
        }
    

        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};

        int count = countDistinct(arr);
        System.out.println("Number of distinct elements: " + count);
    }
    
}

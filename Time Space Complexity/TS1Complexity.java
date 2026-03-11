// Nested loops with O(n^2) complexity
public class TS1Complexity {
    public static void main(String[] args) {
        int n = 100; // Example input size
        int result = exampleFunction(n);
        System.out.println("Result: " + result);
    }

    public static int exampleFunction(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += i * j; // O(n^2) complexity
            }
        }
        return sum;
    }
    
}

package Part1;
//print the reverse of num from 10 to 1 using recursion. 

public class PrintNum {

    public static void printNum(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        System.out.println(n + " ");
        printNum(n - 1);
    }

    // Main Function
    public static void main(String[] args) {
        int n = 10;
        printNum(n);
    }
}

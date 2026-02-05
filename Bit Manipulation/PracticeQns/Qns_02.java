//Swap two number without using any third variable

public class Qns_02 {
    public static void swapping(int a, int b) {
        System.out.println("Before swapping \na : " + a);
        System.out.println("b : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping\na : " + a);
        System.out.println("b is : " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swapping(a, b);

    }

}

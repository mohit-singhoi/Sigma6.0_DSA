package Functions.PracticeQns;

public class Qns_04 {
    public static int getMin(int a, int b) {

        return Math.min(a, b);
    }

    public static int getMax(int a, int b) {

        return Math.max(a, b);
    }

    public static double getSqrt(double a) {
        return Math.sqrt(a);

    }

    public static double getPow(double a, double b) {
        return Math.pow(a, b);
    }

    static double getAvg(double a, double b) {
        return (a + b) / 2.0;
    }

    static int getAbs(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {
        System.out.println("Get Min Value is : " + getMin(10, 78));
        System.out.println("Get Min Value is : " + getMax(100, 78));
        System.out.println("Get Min Value is : " + getSqrt(12));
        System.out.println("Get Min Value is : " + getPow(5, 2));
        System.out.println("Get Min Value is : " + getAvg(10, 78));
        System.out.println("Get Min Value is : " + getAbs(-28));

    }

}

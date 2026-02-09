package Polymorphism;

public class Main1 {

    public static void main(String[] args) {
        Main m = new Main();
        int a = 10;
        int b = 15;
        int result = m.add(a, b);
        System.out.println("Addition of Two Number :" + result);
        System.out.println("Addition of three Number is : "+m.add(a, b,12));
    }

}

class Main {
    public int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

}

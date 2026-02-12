public class Qns_07 {
    public static void main(String[] args) {
        Test t = new Test();
        Test.changeB();
        System.out.println("Final Output : " +(Test.a + Test.b));
    }
}

class Test{
    static int a =10;
    static int b;
    static void changeB(){
        b = a*4;

    }
}


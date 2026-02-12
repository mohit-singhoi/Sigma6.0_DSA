public class Qns_06 {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(87);
        System.out.println("Marks : " + Test.marks);
        System.out.println("Marks : " + t.marks); // Both will work because marks is static variable (satatic variable , function , methods will be accessable using object as well as class name).
    }
}

class Test{
    static int marks;

    void set_marks(int marks){
        this.marks = marks;  // line 1
    }
}

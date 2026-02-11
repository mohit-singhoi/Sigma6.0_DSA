package Interfaces;

public class Main3 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
    }
}

interface A{
    void show();
}

interface B{
    void display();
}

class Test implements A , B{

    public void show(){
        System.out.println("Show Interface A");
    }

    public void display(){
        System.out.println("Display Interface B");

    }
}
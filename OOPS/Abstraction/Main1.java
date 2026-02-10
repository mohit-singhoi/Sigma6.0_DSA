package Abstraction;

public class Main1 {
    public static void main(String[] args) {
        Hen h = new Hen();
        h.eat();
        h.walk();

        Cow c = new Cow();
        c.eat();
        c.walk();
        System.out.println("The Cow color is : " +c.color);

       // Animal a = new Animal(); // error You can not create object of abstract class

    }

}

abstract class Animal {
    String color = "Black";

    void eat() {
        System.out.println("Animal Eats.");
    }

    abstract void walk();
}

class Cow extends Animal {

    void walk() {
        System.out.println("Walks using 4 legs.");
    }
}

class Hen extends Animal {

    void walk() {
        System.out.println("Walks using 2 legs.");
    }
}
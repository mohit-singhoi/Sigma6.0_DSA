package Inheritance;

public class Main3 {
    public static void main(String[] args) {
        Cow c = new Cow("Black");
        c.jugaalee();
        c.eat();
        c.breath();

        Mammal m = new Mammal();
        m.swim();
        m.eat();
        m.breath();

        Dog d = new Dog("Brown");
        d.barks();
        d.eat();
        d.breath();
    }

}

class Animal {
    String name;
    String color = "Black";

    void eat() {
        System.out.println("Eating...");
    }

    void breath() {
        System.out.println("Breathing....");
    }
}

class Mammal extends Animal {
    Mammal() {
        // this.color = color;
        color = "white";
        System.out.println("Mammal Color is  : " + this.color);
    }

    void swim() {
        System.out.println("Swim");
    }
}

class Dog extends Animal {
    Dog(String color) {
        this.color = color;
        // color = "Dark Black";
        System.out.println("Dog Color is : " + this.color);
    }

    void barks() {
        System.out.println("Barks");
    }
}

class Cow extends Animal {
    Cow(String color) {
        this.color = color;
        // color = "Black & White";
        System.out.println("Cow Color is Black & White");
    }

    void jugaalee() {
        System.out.println("Cow is chew the cud");
    }
}

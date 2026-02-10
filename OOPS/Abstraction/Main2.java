package Abstraction;

public class Main2 {
    public static void main(String[] args) {
        Hen h = new Hen();
        h.eat();
        h.walk();
        System.out.println("Hen Color : " +h.color);
        h.changeColor();
        System.out.println("Updated Hen Color is : " +h.color);
        

        Cow c = new Cow();
        c.eat();
        c.walk();
        System.out.println("The Cow color is : " +c.color);
        c.changeColor();
        System.out.println("Updated Cow color is : " +c.color);

       // Animal a = new Animal(); // error You can not create object of abstract class

    }

}

abstract class Animal {
    String color ;

    Animal(){
        color = "Brown";
    }

    void eat() {
        System.out.println("Animal Eats.");
    }

    abstract void walk();
}

class Cow extends Animal {

    void changeColor(){
        color = "Black";
    }

    void walk() {
        System.out.println("Walks using 4 legs.");
    }
}

class Hen extends Animal {
    void changeColor(){
        color = "White";
    }

    void walk() {
        System.out.println("Walks using 2 legs.");
    }
}
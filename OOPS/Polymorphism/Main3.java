// RunTime Polymorphism -> method overriding
package Polymorphism;

public class Main3 {
    public static void main(String[] args) {

        //1.
        Dog d = new Dog();
        d.eat();

        //2.
        Animal a = new Dog();
        a.eat();

        //3.
        Animal a1 = new Animal();
        a1.eat();
        
    }
    
}
class Animal{
    String name;
    void eat(){
        System.out.println("Eating Anything...");
    }

}

class Dog extends Animal{
    String color = "Black";

    void eat(){
        System.out.println("Dog generally Eat Meat..");
    }
    void barks(){
        System.out.println("Dog Barks");
    }

}

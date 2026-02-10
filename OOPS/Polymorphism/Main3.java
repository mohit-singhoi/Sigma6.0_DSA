// RunTime Polymorphism -> method overriding
package Polymorphism;

public class Main3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        
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

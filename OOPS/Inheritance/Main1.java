package Inheritance;

public class Main1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        
        // Parent Class Methods
        d1.eat();
        d1.breathe();

        // Child Class methods
    }
    
}

//Base Class (Parent Class)
class Animal{
    String color;
    String Name;

    void eat(){
        System.out.println("Parent Class Methods is Calling...\nEating..");
    }

    void breathe(){
        System.out.println("Breathes");
    }

}

//Derived Class (Child Class)
class Dog extends Animal{
    int height;
    
    void barks(){
        System.out.println("Child Class Methods is Calling...\nDog Barks");
    }
}


package Interfaces;

public class Main1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.color = "White & Black";
        System.out.println("Dog Color is : " +d.color);
        d.sound();
    }
    
}

interface Animal{
    void sound(); // by default method is public and an abstract method.
}

class Dog implements Animal{
    String color;

    public void sound(){
        System.out.println("Dog Barks..");
    }
}
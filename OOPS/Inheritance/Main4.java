package Inheritance;

public class Main4 {
    public static void main(String[] args) {
        Katla k = new Katla();
        k.swim();
        k.kswim();

        Shark s = new Shark();
        s.swim();
        s.sharkswim();
        s.color ="Brown";
        System.out.println("Shark Fish color is : "+s.color);

        Peacock p = new Peacock();
        p.fly();
        p.color = "Yellow";
        System.out.println("Peacock Color is dark Red & yellow");
        System.out.println("Peacock size is : "+p.size);


        Dog d = new Dog();
        d.eat();
        d.breath();
        d.iq = 45;
        System.out.println("Mammals IQ is :"+d.iq);


        Cat c = new Cat();
        c.eat();
        c.color ="black";
        System.out.println("cat Color is : "+c.color);
        c.breath();
        c.meao();

        Human h = new Human();
        h.breath();
        h.age =22;
        System.out.println("Human  Current Age is :"+h.age);
        h.eat();
        h.listen();
        h.iq = 94;
        System.out.println("Human IQ Level is  : "+h.iq);
        h.color = "MidWhite";
        System.out.println("Human Body & Face Color is :"+h.color);
    }

    

    
}


//Parent Class / Main Class
class Animal {
    String color;
    String name;

    void eat(){
        System.out.println("Eating...");
    }

    void breath(){
        System.out.println("Breathing....");
    }
}


//Derived Class / Child Class 
class Fish extends Animal{

    float wt = 1.5f;

    Fish() {
        System.out.println("Fish parent Class");
    }
    
    void swim(){
        System.out.println("Fish Swims");
    }
}

// Child Class  / Derived Class
class Bird extends Animal{
  
    Bird(String color){
        this.color = color;
        System.out.println("Birds color are :"+this.color);
    }

    void fly(){
        System.out.println("Birds are fly on the sky.");
    }
}


// Child Class / Derived class of Animal
class Mammal extends Animal{

    int iq;
    void listen(){
        System.out.println("Mammals Are Listening");
    }
}



// Fish Child Class -> Multilevel Inheritance
class Katla extends Fish{
    String type ="eatingfish";
    
    Katla() {
        System.out.println("Fish Type : "+type);
        System.out.println("katla is Good Fish for Eating..");
    }

    void kswim(){
        System.out.println("Katla Swim");
    }
}


class Shark extends Fish{
    String type ="NonEatingFish";
    
    Shark() {
        System.out.println("Type of Fish : "+type);
    }

    void sharkswim(){
        System.out.println("Deep Swimmer");
    }
}


// Bird Child Class -> Multilevel Inheritance 
class Peacock extends Bird{
    Peacock(){
        super("black");
    }

    String size ="Small";

    void turtring(){
        System.out.println("Peacock Is Trurtring");
    }
}


// Mammals Child Class -> Multilevel Inheritance
class Dog extends Mammal{
    float heightinft = 2;

    void barks(){
        System.out.println("Dog Barks");
    }

}

class Cat extends Mammal{
int foot =4;

    void meao(){
        System.out.println("Cat Meao Meao....");
    }
}

class Human extends Mammal{
    int age = 22;

    void work(){
        System.out.println("Human is working..");
    }

    void reading(){
        System.out.println("Human is Reading a Book");
    }
}
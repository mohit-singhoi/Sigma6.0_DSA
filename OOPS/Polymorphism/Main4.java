package Polymorphism;

public class Main4 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Circle Area : " +c.area());
        
        Triangle t = new Triangle();
        t.h = 7;
        System.out.println("Area of Triangle : " +t.area());
    }
}

class Shape {
    float l = 10;
    float w = 20;
    float b = 15;

    float area() {
        return l * w;
    }
}

class Circle extends Shape {
    int r;
    float pi = 22.0f / 7;

    Circle(int r) {
        this.r = r;
    }

    float area() {
        return pi * r * r;
    }
}

class Triangle extends Shape{
float h;

float area(){
    return 0.5f*b*h;
}

}

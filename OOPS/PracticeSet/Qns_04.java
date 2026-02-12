public class Qns_04 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print(); // Here use function overriding when fun() is same then derived or child class function is execute.

       // obj1.print1(); // Because this method is undefined for the Vehicle class.

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
    
}

class Vehicle{
    void print(){
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle{
    void print(){
        System.out.println("Derived class (car)");

    }

    void print1(){
        System.out.println("Derived class Car.(Print1 fun()");
    }
}
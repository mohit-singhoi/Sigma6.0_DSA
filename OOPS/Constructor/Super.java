package Constructor;
public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println("Horse Color is : " +h.color);
        
    }
    
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor is called.");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "Brown";
       // super(); // Default already  super constructor is called here when obj is created.
        System.out.println("Horse Constructor is called");
    }
}
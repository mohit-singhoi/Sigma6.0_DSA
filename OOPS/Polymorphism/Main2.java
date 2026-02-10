package Polymorphism;

public class Main2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Sum of Two Int Float  : "+c.sum(10,5));
        System.out.println("Sum of Two Float Value  : "+c.sum(5.2f,(float)9.4));
        System.out.println("Sum of Three Number  : "+c.sum(10,5,4));

        
    }
    
}

class Calculator{
    int sum(int a ,int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b , int c){
        return a+b+c;
    }
}

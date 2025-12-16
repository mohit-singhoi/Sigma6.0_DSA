package Functions;

public class Product {
    public static int product(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        int a=3,b=5;
        int product=product(a, b);
        System.out.println("Product : "+product);
    }
    
}

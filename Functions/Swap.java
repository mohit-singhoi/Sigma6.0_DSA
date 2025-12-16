package Functions;

public class Swap {
    // public static void main(String[] args) {
    //     int a=5;
    //     int b=10;
    //     int temp;
    //     System.out.println("Before Swapping \nA :" +a +" B :"+b);
    //     temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println("After Swapping \nA :"+a +" B :"+b);

    // }

    public static void swap(int a, int b){
        //swap two values
        int temp=a;
        a=b;
        b=temp;
        System.out.println("A :"+a);
        System.out.println("B :"+b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        swap(a, b);
    }
    
}

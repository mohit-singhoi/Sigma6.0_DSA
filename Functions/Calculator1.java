//Function Overloading using Data Type
package Functions;

public class Calculator1 {
    //function to calculate int sum
    public static  int sum(int a, int b){
        return a+b;
    }

    //function to calculate float sum
    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two Integer Number :"+sum(10,8));
        System.out.println("Sum of two Float Number : " +sum(8.4f,7.5f));
    }
    
}

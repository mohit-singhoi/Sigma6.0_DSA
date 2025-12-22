// Function Over loading using Parameter
package Functions;

public class Calculator {
    //function to calculate sum of 2 numbers
    public static int sum(int a,int b){
        return a+b;
    }

    //function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two Number :"+sum(10,8));
        System.out.println("Sum of three Number : "+sum(8,7,6));
        
    }


    
}

// public class LogicalOp{
//     int a,b;
//     public LogicalOp(int a, int b){
//         this.a = a;
//         this.b = b;
//     }
//     public void logicalAnd(){
//         if(a > 0 && b > 0){
//             System.out.println("Both numbers are positive.");
//         } else {
//             System.out.println("At least one number is not positive.");
//         }
//     }
//     public void logicalOr(){
//         if(a > 0 || b > 0){
//             System.out.println("At least one number is positive.");
//         } else {
//             System.out.println("Neither number is positive.");
//         }
//     }
//     public void logicalNot(){
//         if(!(a > 0)){
//             System.out.println("First number is not positive.");
//         } else {
//             System.out.println("First number is positive.");
//         }
//     }
//     public static void main(String[] args) {
//         LogicalOp obj = new LogicalOp(5, -3);
//         obj.logicalAnd();
//         obj.logicalOr();
//         obj.logicalNot();
//     }

// }


import java.util.Scanner;
public class LogicalOp{
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();

            if(a > 0 && b > 0){
                System.out.println("Both numbers are positive.");
            } else {
                System.out.println("At least one number is not positive.");
            }

            if(a > 0 || b > 0){
                System.out.println("At least one number is positive.");
            } else {
                System.out.println("Neither number is positive.");
            }

            if(!(a > 0)){
                System.out.println("First number is not positive.");
            } else {
                System.out.println("First number is positive.");
            }

        }
    }
}   
import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){
        System.out.print("Enter the price of pencil :");
        int p1= sc.nextInt();
        System.out.print("Enter the quantity of pencil :");
        int q1= sc.nextInt();

        System.out.print("\nEnter the price of pen :");
        int p2= sc.nextInt();
        System.out.print("Enter the quantity of pen :");
        int q2= sc.nextInt();

        System.out.print("\nEnter the price of Eraser :");
        int p3= sc.nextInt();
        System.out.print("Enter the quantity of Eraser :");
        int q3= sc.nextInt();

        int totalCost= p1*q1 + p2*q2 + p3*q3;

        System.out.println("\nTotal cost is :"+totalCost);

        //System.out.println("After Adding GST Total cost is :"+ totalCost*1.18);

        System.out.println("After Adding GST Total cost is :");
    
        double  finalcost= (totalCost*18)/100 + totalCost;

        System.out.println("GST is :"+ (finalcost - totalCost));

        System.out.println("Final Cost is :"+finalcost);
    }}
}
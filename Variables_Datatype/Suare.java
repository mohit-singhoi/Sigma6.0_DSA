import java.util.Scanner;

public class Suare {
    public static void main(String[]  args){
        
       try( Scanner sc= new Scanner(System.in)){
        System.out.print("Enter the radius of Circle :");
        int r= sc.nextInt();

        double area=3.14*r*r;

        System.out.println("Area of Circle is :"+area);
    }}
    
}

package Interfaces;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Shape sp = new Shape();
        sp.l =60;
        sp.b=25;
        sp.calArea();
        sp.diameter();
        // Circle Area()
        System.out.println("Area of Circle is : "+sp.Area());
    }
    
}

interface Rectangle{
    void calArea();
    
}

interface Circle{
    void diameter();
    float Area();
    
    final float pi = 22.0f/7;
}

class Shape implements Rectangle , Circle{
    Scanner sc = new Scanner(System.in);
    int l;
    int b;

    // System.out.print("Enter Length :");
    // int l = sc.nextInt();

    // System.print("Enter Width :");
    // int b = sc.nextInt();

    

    public void calArea(){
        int area = l*b;
     System.out.println("Area of rectangle is : "+area);
    }

    public void diameter(){
        System.out.print("Enter the Radius : ");
        int r = sc.nextInt();
        float result = 2*pi*r;
        System.out.println("Diameter of Circle is : " +result);

    }
    public float Area(){
        System.out.print("Enter the Radius : ");
        int r = sc.nextInt();
        return pi*r*r;

        
    }
}
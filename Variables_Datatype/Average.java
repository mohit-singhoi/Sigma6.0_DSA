import java.util.Scanner;
public class Average{
    public static int avg(int a, int b, int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        int a1,a2,a3;
       try( Scanner sc= new Scanner(System.in)){
        System.out.println("Enter three number !");
        a1=sc.nextInt();
        a2=sc.nextInt();
        a3=sc.nextInt();
        int avg1 = avg(a1,a2,a3);
        System.out.println("Average of three number is :"+avg1);

    }}
}
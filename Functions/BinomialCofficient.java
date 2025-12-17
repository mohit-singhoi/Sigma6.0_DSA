package Functions;
import java.util.Scanner;
public class BinomialCofficient {
   public static double binCoeff(int n, int r){
        double n_fact=factorial(n);
        double r_fact=factorial(r);
        double nmr_fact=factorial(n-r);

        Double BC=n_fact/(r_fact*nmr_fact);
        return BC;
    }

    public static int factorial(int n){
        if(n==1) return 1;
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;// factorial of n
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N :");
    int n=sc.nextInt();

     System.out.print("Enter the value of R :");
    int r=sc.nextInt();
    System.out.println("Binomial Coefficient is :"+binCoeff(n, r));
    }
    
}

// What is the value of x^x for any values of x?

public class Qns_01 {
    public static double powerofx(int x){
        double  ans = Math.pow(x, x);
        return ans;
    }
    public static void main(String[] args) {
        int x= 3;
        double result = powerofx(x);
        System.out.println("Power of x^x is : " +result);
    }
    
}

package Functions;

public class PrintPrimeRange {

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeRange(int n) {
        System.out.println("Prime Numbers are from range 2 to " + n);
    
        for (int i = 2; i <= n; i++) {
         
                if (isprime(i)) { // true
                    System.out.print(i +" ");

                
            }
        }
        System.out.println();
    

    }

    public static void main(String[] args) {
        printPrimeRange(10);

    }

}

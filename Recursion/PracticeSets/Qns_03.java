// WAP of Friends Pairing problem using recursion

package PracticeSets;

public class Qns_03 {
    public static int pairingProblem(int n){
        if(n ==1 || n ==2){
            return n;
        }

        return  pairingProblem(n-1) + (n-1) * pairingProblem(n-2);
    }
    // Main fun
    public static void main(String[] args) {
        System.out.println("Total No. of ways : " +pairingProblem(3));
    }
}

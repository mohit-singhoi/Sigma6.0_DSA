package Part2;

public class PairingProblem {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        // Choice
        // Single
        int fnm1 = friendsPairing(n-1);

        // Pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //TotalWays
        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    // Main Function
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Total No. of Pairs : " +  friendsPairing(n));
    }
}

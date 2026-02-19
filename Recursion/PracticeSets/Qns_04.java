// WAP to print all binary strings of size N without consecutive 0's using recursion

package PracticeSets;

public class Qns_04 {
    public static void binaryString(int n, String str, int lastDigit){
        //Base case
        if(n == 0){
            System.out.println(str);
            return;
        }

        //Recursive call
        binaryString(n-1, str + "1", 1);
      
        if(lastDigit == 1){
            binaryString(n-1, str + "0", 0);
          
        }

    }
    // Main fun
    public static void main(String[] args) {
        int n = 3;
        System.out.println("All  Possible binary strings of size " + n + " without consecutive 0's are : ");
        binaryString(n, "", 1);
    }
}

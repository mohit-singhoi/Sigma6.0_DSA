// WAP to print all binary strings of size N without consecutive 1's using recursion
package Part2;

public class BinaryString {
    public static void binaryString(int n, String str, int lastDigit){
        // int count = 0;
        //Base case
        if(n == 0){
            System.out.println(str);
          
            return;
        }

        //Recursive call
        binaryString(n-1, str + "0", 0);
      
        if(lastDigit == 0){
            binaryString(n-1, str + "1", 1);
          
        }

    }
    // Main fun
    public static void main(String[] args) {
        int n = 3;
        System.out.println("All  Possible binary strings of size " + n + " without consecutive 1's are : ");
        binaryString(n, "", 0);
    }
}

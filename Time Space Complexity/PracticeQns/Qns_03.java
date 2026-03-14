// Write a program and also find the time and space complexity of the floorSqrt function.

package PracticeQns;

public class Qns_03 {
    public static int  floorSqrt(int n){
        if(n == 0 || n == 1)
            return n;

        int i=1,  result =1;

        while(result <=n){
            i++;
            result = i *i;
        }
        return i-1;
    }

    // Main fun
    public static void main(String[] args) {
        int x = 11;
        System.out.println(floorSqrt(x));
    }    
}

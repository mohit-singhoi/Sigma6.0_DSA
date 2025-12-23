package Functions;
import java.util.Scanner;

public class ConvertBinToDec {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int mynum=binNum;

        while (binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + mynum + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary Number :");
        int num= sc.nextInt();
        binToDec(num);
    }

    

}

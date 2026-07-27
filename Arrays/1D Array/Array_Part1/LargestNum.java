import java.util.Scanner;

public class LargestNum {
    public static int LargestNum(int num[]) {
        int largest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest)
                largest = num[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[] ={7,9,0,1,88,9,123,8,0,8,7};
        int result = LargestNum(num);
        System.out.println("largest number is : "+result);
    }

}

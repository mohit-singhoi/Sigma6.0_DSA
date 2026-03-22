
// Wap of Pair sum problem using Two pointer approach
import java.util.ArrayList;
import java.util.Scanner;

public class PairSum2 {

    // Two Pointer Approach : O(n)
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target)
                return true;

            // Case 2
            if (list.get(lp) + list.get(rp) < target)
                lp++;

            // Case 3
            if (list.get(lp) + list.get(rp) > target)
                rp--;

        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target value : ");
        target = sc.nextInt();

        System.out.println("Pair is Found : "+pairSum(list, target));
        sc.close();

    }

}

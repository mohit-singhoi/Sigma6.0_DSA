
// Wap of Pair sum problem using Two pointer approach
import java.util.ArrayList;
import java.util.Scanner;

public class PairSum2 {

    // Two Pointer Approach : O(n)
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)> list.get(i+1)){ // breaking point
                bp = i;
                break;
            }
        }

        int lp = bp+1; // smallest element
        int rp = bp; // large element
        while (lp != rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target)
                return true;

            // Case 2
            if (list.get(lp) + list.get(rp) < target){
                lp = (lp+1)% n;
            }else{
                // Case 3
                rp = (n+rp-1) %n;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 11, 15, 6, 8, 9, 10 - Sorted & Rotated ArrayList
        // Adding elements in the list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target value : ");
        target = sc.nextInt();

        System.out.println("Pair is Found : "+pairSum(list, target));
        sc.close();

    }

}

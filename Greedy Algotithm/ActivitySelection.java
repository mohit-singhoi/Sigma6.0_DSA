
// Activity Selection Problem
// Given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        // End time basis sorted activities
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct =1;
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("The maximum number of activities is: " + maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

}

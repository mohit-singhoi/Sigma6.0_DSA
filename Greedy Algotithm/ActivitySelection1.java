
// Activity Selection Problem
// Given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.
import java.util.*;

public class ActivitySelection1 {
    public static void main(String[] args) { // O(n)
        // Sorted input
        // int[] start = { 1, 3, 0, 5, 8, 5 };
        // int[] end = { 2, 4, 6, 7, 9, 9 };

        // Unsorted input
        int[] start = { 5, 1, 3, 0, 8, 5 };
        int[] end = { 7, 2, 4, 6, 9, 9 };

        // Sorting
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Lambda function -> sortfrom the end time
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // End time basis sorted activities
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < start.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("The maximum number of activities is: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

}

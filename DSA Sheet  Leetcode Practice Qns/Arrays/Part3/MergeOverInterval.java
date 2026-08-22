// Merge Intervals Problem : 56

// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

// Example 1:
// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]

// Example 2:
// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]

import java.util.*;

public class MergeOverInterval {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }

        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (currentInterval[1] >= intervals[i][0]) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // No overlap, add the current interval to the merged list
                merged.add(currentInterval);
                currentInterval = intervals[i];
            }
        }

        // Add the last interval
        merged.add(currentInterval);

        return merged.toArray(new int[merged.size()][]);
    }

    // Main method to test the merge function
    public static void main(String[] args) {
        int[][] intervals1 = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] mergedIntervals1 = merge(intervals1);
        System.out.println("Merged Intervals 1: " + Arrays.deepToString(mergedIntervals1));
    }
}

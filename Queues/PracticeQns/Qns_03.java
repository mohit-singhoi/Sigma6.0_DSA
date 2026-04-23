// Qns 3: Job Sequencing Problem
// We have an arra of jobs where every job has a deadline and associated profit if the job is finished before the deadline. It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. We earn the profit if and only if the job is completed by its deadline. The task is to find the maximum profit and the number of jobs done.
package PracticeQns;
import java.util.*;

class Qns_03 {

    static class Job {
        int id;
        int deadline;
        int profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {

        // Example jobs
        Job[] jobs = {
            new Job(1, 2, 100),
            new Job(2, 1, 19),
            new Job(3, 2, 27),
            new Job(4, 1, 25),
            new Job(5, 3, 15)
        };

        // Step 1: Sort jobs by profit (descending)
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Step 2: Find maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Step 3: Create slots
        int[] slot = new int[maxDeadline + 1]; // 1-based indexing
        Arrays.fill(slot, -1);

        int totalProfit = 0;

        // Step 4: Schedule jobs
        for (Job job : jobs) {
            // Try to fit job in latest free slot
            for (int j = job.deadline; j > 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        // Step 5: Print result
        System.out.println("Selected Jobs:");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slot[i] != -1) {
                System.out.print("J" + slot[i] + " ");
            }
        }

        System.out.println("\nTotal Profit: " + totalProfit);
    }
}
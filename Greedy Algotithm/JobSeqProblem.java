// To solve the Job Sequencing Problem, we can use a greedy algorithm. The idea is to sort the jobs based on their profit in descending order and then schedule them in such a way that we maximize the total profit while ensuring that no two jobs overlap.
// Job A = 4,20
// Job B = 1,10
// Job C = 1,40
// Job D = 1,40
// Job E = 1,30

import java.util.*;

public class JobSeqProblem {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int d, int p, int i) {
            this.deadline = d;
            this.profit = p;
            this.id = i;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {
                { 4, 20 },
                { 1, 10 },
                { 1, 40 },
                { 1, 40 },
                { 1, 30 }
        };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(jobsInfo[i][0], jobsInfo[i][1], i));
        }

        // Sort jobs by profit in descending order
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> sequence = new ArrayList<>();
        int time = 0;
        int totalProfit = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);

            if (curr.deadline > time) {
                sequence.add(curr.id);
                totalProfit += curr.profit;
                time++;
            }
        }

        System.out.println("Maximum jobs that can be done: " + sequence.size());
        System.out.print("Job sequence: ");

        for (int id : sequence) {
            System.out.print("J" + id + " ");
        }

        System.out.println("\nTotal Profit: " + totalProfit);
    }
}
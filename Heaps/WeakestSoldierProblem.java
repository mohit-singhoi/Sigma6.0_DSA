// Weakest Soldier Problem
//

import java.util.*;
public class WeakestSoldierProblem {
    static class Row implements Comparable<Row> {
        int index;
        int soldiers;

        Row(int index, int soldiers) {
            this.index = index;
            this.soldiers = soldiers;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.index - r2.index; // If soldiers are equal, compare by index
            }
            else {
                return this.soldiers - r2.soldiers; // Compare by number of soldiers
            }
           
        }
    }

    public static void main(String[] args) {
        int[][] army = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };
        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();


        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[i].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
          
            pq.add(new Row(i, count )); // Add row index and soldier count to the priority queue
        }

        System.out.println("The weakest soldiers are in rows:");
        for (int i = 0; i < k; i++) {
            System.out.println("R" + pq.poll().index); // Print the index of the weakest rows

        }
    }
}

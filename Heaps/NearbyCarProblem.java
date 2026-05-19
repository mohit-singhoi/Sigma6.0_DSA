// Nearby Car Problem
// We are given n points in a 2D plane which are locations of n cars. if we are ta the origin, print the nearest k cars.

// Input: C0(3,3) C1(5,-1) C2(-2,4) k=2
// Output: C0 & C2

import java.util.*;
public class NearbyCarProblem {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq; // In Ascending order
        }

    }

    public static void main(String[] args) {
        int pts[][] ={{3,3}, {5,-1}, {-2,4}};
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0; i<pts.length; i++){
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        // Print the nearest k cars
        for(int i=0; i<k; i++){
            Point p = pq.poll();
            System.out.println("C" + p.idx + ": (" + p.x + ", " + p.y + ")");
        }
    }
    
}

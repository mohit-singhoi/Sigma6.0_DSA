// Chocola Problem 
// Given a chocolate bar of size m x n. You have to break the chocolate bar into small pieces of size 1 x 1. The cost of breaking the chocolate bar is equal to the number of pieces you are breaking at that moment. You have to find the minimum cost to break the chocolate bar into small pieces of size 1 x 1.

import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4, m = 6;

        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) { // Horizontal Cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else { // Verticle cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost of Cuts : " + cost);

    }

}

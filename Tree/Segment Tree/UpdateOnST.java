// Segment Tree - Range Sum Query with Point Update

import java.util.*;

public class UpdateOnST {

    static int tree[];

    // Initialize Segment Tree
    public static void init(int n) {
        tree = new int[4 * n];
    }

    // Build Segment Tree - O(n)
    public static int buildST(int arr[], int i, int start, int end) {

        if (start == end) {
            tree[i] = arr[start];
            return tree[i];
        }

        int mid = start + (end - start) / 2;

        int left = buildST(arr, 2 * i + 1, start, mid);
        int right = buildST(arr, 2 * i + 2, mid + 1, end);

        tree[i] = left + right;

        return tree[i];
    }

    // Range Sum Query - O(log n)
    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {

        // No Overlap
        if (sj < qi || si > qj) {
            return 0;
        }

        // Complete Overlap
        if (si >= qi && sj <= qj) {
            return tree[i];
        }

        // Partial Overlap
        int mid = si + (sj - si) / 2;

        int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
        int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);

        return left + right;
    }

    public static int getSum(int arr[], int qi, int qj) {

        if (qi < 0 || qj >= arr.length || qi > qj) {
            System.out.println("Invalid Query!");
            return -1;
        }

        return getSumUtil(0, 0, arr.length - 1, qi, qj);
    }

    // Update Helper - O(log n)
    public static void updateUtil(int i, int si, int sj, int idx, int diff) {

        // Index is outside current segment
        if (idx < si || idx > sj) {
            return;
        }

        // Update current node
        tree[i] += diff;

        // If not a leaf node
        if (si != sj) {
            int mid = si + (sj - si) / 2;

            updateUtil(2 * i + 1, si, mid, idx, diff);
            updateUtil(2 * i + 2, mid + 1, sj, idx, diff);
        }
    }

    // Point Update
    public static void update(int arr[], int idx, int newVal) {

        if (idx < 0 || idx >= arr.length) {
            System.out.println("Invalid Index!");
            return;
        }

        int diff = newVal - arr[idx];
        arr[idx] = newVal;

        updateUtil(0, 0, arr.length - 1, idx, diff);
    }

    // Print Segment Tree
    public static void printTree() {
        System.out.println("\nSegment Tree:");
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int n = arr.length;

        init(n);

        buildST(arr, 0, 0, n - 1);

        printTree();

        System.out.print("\nEnter Query Start Index : ");
        int qi = sc.nextInt();

        System.out.print("Enter Query End Index : ");
        int qj = sc.nextInt();

        System.out.println("\nTotal Sum = " + getSum(arr, qi, qj));

        // Update index 2 from 3 to 2
        update(arr, 2, 2);

        System.out.println("\nAfter Updating index 2 to value 2:");

        printTree();

        System.out.println("\nUpdated Sum = " + getSum(arr, qi, qj));

        sc.close();
    }
}
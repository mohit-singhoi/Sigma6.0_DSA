// Query on Segment Tree

import java.util.Scanner;

public class QueryOnST {

    // Build Segment Tree
    static int tree[];

    public static void init(int n) {
        tree = new int[4 * n];

    }

    // O(n)
    public static int buildST(int arr[], int i, int start, int end) {
        if (start == end) {
            tree[i] = arr[start];
            return arr[start];
        }

        int mid = (start + end) / 2;
        buildST(arr, 2 * i + 1, start, mid); // left subtree - 2*i+1
        buildST(arr, 2 * i + 2, mid + 1, end); // right subtree - 2*i+2
        tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
        return tree[i];
    }

    public static int getSumUtil(int i, int si, int sj, int qi, int qj) {
        if (qj <= si || qi >= sj) { // non overlapping
            return 0;
        } else if (si >= qi && sj <= qj) {// complete overlap
            return tree[i];
        } else { // partial overlap
            int mid = (si + sj) / 2;
            int left = getSumUtil(2 * i + 1, si, mid, qi, qj);
            int right = getSumUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return left + right;

        }

    }

    //O(logn)
    public static int getSum(int arr[], int qi, int qj) {
        int n = arr.length;
        return getSumUtil(0, 0, n - 1, qi, qj);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n - 1);

        System.out.print("Enter The number from : ");
        int qi = sc.nextInt();

        System.out.print("Enter The number to : ");
        int qj = sc.nextInt();

        System.out.println("Total Sum between range : " + getSum(arr, qi, qj));

    }
}

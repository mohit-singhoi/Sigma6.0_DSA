// Max Element Query Problem
// Given an arr[], we have to answer few queries :
// a. Output Max of subarray
// Update the element at idx
// {6,8,-1,2,17,1,3,2,4}

import java.util.Scanner;

public class MinEleQuery {
    static int tree[];

    public static void init(int n) {

        tree = new int[4 * n];
    }

    public static void buildTree(int i, int si, int sj, int arr[]) {
        if (si == sj) {
            tree[i] = arr[si];
            return;
        }

        int mid = (si + sj) / 2;
        buildTree(2 * i + 1, si, mid, arr);
        buildTree(2 * i + 2, mid + 1, sj, arr);

        tree[i] = Math.min(tree[2 * i + 1], tree[2 * i + 2]);
    }

    public static int getMin(int arr[], int qi, int qj) {
        int n = arr.length;
        return getMinUtil(0, 0, n - 1, qi, qj);
    }

    public static int getMinUtil(int i, int si, int sj, int qi, int qj) {
        if (si > qj || sj < qi) { // no overlap
            return Integer.MAX_VALUE;
        } else if (si >= qi && sj <= qj) {// complete overlap
            return tree[i];
        } else { // partial overlap
            int mid = (si + sj) / 2;
            int leftAns = getMinUtil(2 * i + 1, si, mid, qi, qj);
            int rightAns = getMinUtil(2 * i + 2, mid + 1, sj, qi, qj);
            return Math.min(leftAns, rightAns);

        }

    }

    public static void update(int arr[], int idx, int newval) {
        arr[idx] = newval;
        int n = arr.length;
        updateUtil(0, 0, n - 1, idx, newval);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newval) {
        if (idx < si || idx > sj) {
            return;
        }

        if(si == sj){
            tree[i] = newval;
        }

        if (si != sj) {
            tree[i] = Math.min(tree[i], newval);
            int mid = (si + sj) / 2;
            updateUtil(2 * i + 1, si, mid, idx, newval); // left
            updateUtil(2 * i + 2, mid + 1, sj, idx, newval); // right

        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 6, 8, -1, 2, 17, 1, 3, 2, 4 };
        int n = arr.length;

        init(n);
        buildTree(0, 0, n - 1, arr);


        System.out.print("Enter The number from : ");
        int qi = sc.nextInt();

        System.out.print("Enter The number to : ");
        int qj = sc.nextInt();

        int max = getMin(arr, qi, qj);
        System.out.println("Min Element between range between  " + qi + " to " + qj + " is : " + max); // 17

        update(arr, 2, 20);

        max = getMin(arr, qi, qj);
        System.out.println("After updation Min Element between range between  " + qi + " to " + qj + " is : " + max); // 20
    }

}

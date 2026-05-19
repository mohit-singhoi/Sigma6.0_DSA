
// perform Delete operation in Heap
import java.util.*;

public class DeleteHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);
            int x = arr.size() - 1; // x is child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) { // O(logn)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        private void hipify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            if (minIdx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                hipify(minIdx);
            }
        }

        // Remove
        public int remove() {
            int last = arr.size() - 1;
            // Step1 : swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(last));
            arr.set(last, temp);

            // Step2 : remove last
            arr.remove(last);

            // Step3 : down heapify
            hipify(0);
            return temp;

            // int i = 0;
            // int left = 2 * i + 1;
            // int right = 2 * i + 2;
            // int minIdx = i;

            // if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
            // minIdx = left;
            // }
            // if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
            // minIdx = right;
            // }
            // if (minIdx != i) {
            // // swap
            // temp = arr.get(i);
            // arr.set(i, arr.get(minIdx));
            // arr.set(minIdx, temp);
            // i = minIdx;
            // }
        }

        // Check if Heap is empty
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    // Print Heap in Preorder
    public static void preOrder(ArrayList<Integer> arr, int i) {
        if (i >= arr.size()) {
            return;
        }
        System.out.print(arr.get(i) + " ");
        preOrder(arr, 2 * i + 1); // left child
        preOrder(arr, 2 * i + 2); // right child
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);
        h.add(3);
        h.add(8);
        h.add(1);

        System.out.println(h.arr);
        preOrder(h.arr, 0);
        System.out.println();

        int removed = h.remove();
        System.out.println("Removed: " + removed);
        System.out.println(h.arr);
        preOrder(h.arr, 0);

        System.out.println("\nIs Empty: " + h.isEmpty());
    }
}

import java.util.*;

// Heap operations
public class HeapOp {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last index
            arr.add(data);
            int x = arr.size() - 1; // x is child index
            int par = (x-1)/2; // parent index

            while(arr.get(x) < arr.get(par)){ //O(logn)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }
    }

    // Print Heap in Preorder
    public static void preOrder(ArrayList<Integer> arr, int i){
        if(i >= arr.size()){
            return;
        }
        System.out.print(arr.get(i)+" ");
        preOrder(arr, 2*i+1); // left child
        preOrder(arr, 2*i+2); // right child
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);
        h.add(3);
        h.add(8);
        h.add(1);

        System.out.println(h.arr);
        preOrder(h.arr, 0);
    }
    
}

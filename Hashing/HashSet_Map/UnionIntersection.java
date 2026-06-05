package HashSet_Map;
import java.util.*;


public class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Find union
        HashSet<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }

        for(int i =0;i<arr2.length;i++){
            union.add(arr2[i]);
        }

        System.out.println("Union: " + union);
        System.out.println("Union size: " + union.size());


        // Find intersection
        HashSet<Integer> intersection = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : arr2) {
            set2.add(num);
        }
        for (int num : arr1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println("Intersection: " + intersection.size());
        System.out.println("Intersection: " + intersection);
    }
}

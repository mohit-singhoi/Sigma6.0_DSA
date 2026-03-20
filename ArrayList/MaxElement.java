// WAP to find the maximum element in an ArrayList
import java.util.ArrayList;
public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(21);
        list.add(3);
        list.add(14);
        list.add(5);

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum element in the ArrayList is: " + max);
    }
}

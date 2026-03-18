import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // Access element
        System.out.println(list.get(1)); // 20

        // Update element
        list.set(1, 50);

        // Remove element
        list.remove(2);

        System.out.println(list);
    }
}
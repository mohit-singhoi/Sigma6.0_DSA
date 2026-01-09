import java.util.Scanner;


public class functionalArgument {
    int nonchangable=20;
    public static void update(int marks[],int nonchangable) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 78, 89, 90 };
        int nonchangable=10;
        update(marks,nonchangable);
        System.out.println(nonchangable);

        // print our updated marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}

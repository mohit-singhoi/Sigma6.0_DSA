import segmenttree.UpdateOnST;

public class Main {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};

        UpdateOnST.init(arr.length);

        UpdateOnST.buildST(arr, 0, 0, arr.length - 1);

        System.out.println("Segment Tree:");
        UpdateOnST.printTree();

        System.out.println("Sum (2,5) = " +
                UpdateOnST.getSum(arr, 2, 5));

        UpdateOnST.update(arr, 2, 10);

        System.out.println("After Update:");
        UpdateOnST.printTree();

        System.out.println("Sum (2,5) = " +
                UpdateOnST.getSum(arr, 2, 5));
    }
}

// WAP to find the Last Occurence of an Element in an array.

public class LastOccurence {
    public static int  lastOccurence(int arr[] , int key , int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }

        // Check with Self
        if(arr[i] == key){
            return i;
        }
        return isFound;


    }

    //Main fun
    public static void main(String[] args) {
        int arr [] = {2,1,7,8,3,8,7,3,9,};
        int key = 3;
        int result = lastOccurence(arr, key, 0);
                System.out.println("Element  " + key + " Last Occurence is Appears in : " +result + "th position.");
    }
}

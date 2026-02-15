//WAP to find the first occurence of an element in an array

public class FirstOccurence {
    public static int firstOccurence(int arr[] ,int key , int i){

        if(i == arr.length) return -1;
        if(arr[i] == key) return i;

       return firstOccurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr [] = {7,8,1,2,3,4,5,7,3,6};
        int key =3;
        int result = firstOccurence(arr, key,0);
        System.out.println("Element  " + key + " First Occurence is Appears in : " +result + "th position.");
    }
}

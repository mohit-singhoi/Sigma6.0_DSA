// WAP to print the second largest element in the given array

package Practice;

public class Qns_02 {
    public static int secondLargestElement(int arr[]){
        int largest =arr[0];
        int seclargest =arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
       // return largest;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<largest && arr[i]>seclargest){
                seclargest=arr[i];
            }
        }

        return seclargest;
    }

    public static void main(String[] args) {
        int arr[] = {4,8,98,12,7,6,3,465,2,433,31};

        int result=secondLargestElement(arr);
       // System.out.println("Largest Element is : " +result);
        System.out.println("Second Largest Element is : " +result);

    }
    
    
}

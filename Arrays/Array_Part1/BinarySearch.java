import java.util.*;
public class BinarySearch {
    public static int binarySearch(int num[],int target){
        int start = 0;
        int end= num.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;
            if(num[mid]==target) return mid;

            else if(mid<target) start=mid+1;
            
            else end = mid-1;
        }
        return -1;

    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10,11,17,25};
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the key Value :");
        int key = sc.nextInt();

        int result = binarySearch(num, key);
        if(result==-1)
            System.out.println("Element Not Found");

        else
            System.out.println("Element found at the index : " +result);
    }
    
}

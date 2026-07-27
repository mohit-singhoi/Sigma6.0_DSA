//WAP to print the MAX Subarray Sum using Prefix sum using kadanes algorithm

//WAP to print the MAX Subarray Sum using Prefix sum method

package Array_Part2;

public class MaxSubarraySum {
    public static void prefixmaxSubArray(int arr[]){
        int currsum =0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        //Calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end = j;

                currsum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
                // System.out.println(currsum);

                if(maxsum <currsum){
                    maxsum =currsum;
                }
            }
        }
        System.out.println("Max Sum = " +maxsum);

    }
    
    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i =0;i<arr.length;i++){
            cs = cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }

        System.out.println("Our max subarray sum is : " +ms);

    }

    public static void main(String[] args) {
        int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}

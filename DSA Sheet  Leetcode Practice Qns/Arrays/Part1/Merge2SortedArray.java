// Leetcode Problem : 88
//Merge 2 Sorted Array Without extra space 
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

public class Merge2SortedArray{

    public void merge(int[] nums1, int m, int[] nums2, int n) { //O(m+n)
        int idx = m+n-1, i = m-1, j = n-1;

        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[idx--] = nums1[i--];
            } else {
                nums1[idx--] = nums2[j--];
            }
        }
        while(j >= 0){
            nums1[idx--] = nums2[j--];
        }
    }
    
    //Printsorted Array
    

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m =3;
        int nums2[] = {2,5,6};
        int n = 3;

        
    }
}
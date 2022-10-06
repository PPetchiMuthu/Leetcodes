// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
// Example 2:

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].
// Example 3:

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

import java.util.Arrays;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int position=m+n-1;
        n=n-1;
        m=m-1;
        while(position>=0){
            int nums_1 =(m>=0)?nums1[m]:Integer.MIN_VALUE;
            int nums_2 =(n>=0)?nums2[n]:Integer.MIN_VALUE;

            if(nums_1<nums_2) {
                nums1[position--]=nums_2;
                n--;
            }
            else{
                nums1[position--]=nums_1;
                m--;
            }
        }
        System.out.println(Arrays.toString(nums1));

    }

    public static void main(String[] args) {
        MergeSortedArray merg = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merg.merge(nums1,m,nums2,n);
    }
}
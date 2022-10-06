//Example 1:
//
//        Input: nums = [3,6,9,1]
//        Output: 3
//        Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
//        Example 2:
//
//        Input: nums = [10]
//        Output: 0
//        Explanation: The array contains less than 2 elements, therefore return 0.

import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length<=1)
            return 0;
        Arrays.sort(nums);
        int gap =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]>gap)
                gap = nums[i+1]-nums[i];
        }
        return gap;
    }

    public static void main(String[] args) {
        MaximumGap gap = new MaximumGap();
        int[] nums = {3,6,9,1};
        System.out.println(gap.maximumGap(nums));
    }
}

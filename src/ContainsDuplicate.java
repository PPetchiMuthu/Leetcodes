// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true

import java.util.Arrays;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate contain = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        System.out.println(contain.containsDuplicate(nums));
    }
}

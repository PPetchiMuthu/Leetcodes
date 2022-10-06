// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

import java.util.Arrays;

class  MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=0)
                nums[count++]=nums[i];
        for(int i=count;i<nums.length;i++)
            nums[i]=0;
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        MoveZeroes move = new MoveZeroes();
        int[]  nums = {0,1,0,3,12};
        move.moveZeroes(nums);

    }
}

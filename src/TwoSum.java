import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            int ar[] = new int[2];
            for(int i=0;i<nums.length-1;i++)
                for(int j=i+1;j<nums.length;j++)
                    if(nums[i]+nums[j]==target){
                        ar[0]=i;
                        ar[1]=j;
                    }

            return ar;

        }

        public static void main(String[] args) {
            int[] nums = {2,7,11,14};
            int target = 9;
            TwoSum s = new TwoSum();
            System.out.println(Arrays.toString(s.twoSum(nums,target)));
        }

}

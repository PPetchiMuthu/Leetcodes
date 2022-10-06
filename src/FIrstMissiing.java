import java.util.Arrays;

public class FIrstMissiing {
        public int firstMissingPositive(int[] nums) {
            Arrays.sort(nums);
            int missing =0;
            int i;
            for(i=0;i<nums.length-1;i++){
                if(nums[i]<0)
                    continue;
                if(nums[i]==missing&&nums[i]!=nums[i+1])
                    missing++;
                else if(nums[i]!=missing)
                    break;
            }
            return (i==nums.length)?missing+1:missing;
        }

    public static void main(String[] args) {
        FIrstMissiing fIrstMissiing = new FIrstMissiing();
        System.out.println(fIrstMissiing.firstMissingPositive(new int[]{1, 2, 0,-1,2}));
    }
    }


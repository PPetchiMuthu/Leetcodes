//Example 1:
//
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2
//        Example 2:
//
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1
//        Example 3:
//
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                start = mid+1;
            if(nums[mid]>target)
                end = mid-1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6}; int target = 7;
        SearchInsertPosition search = new SearchInsertPosition();
        System.out.println(search.searchInsert(nums,target));
    }
}

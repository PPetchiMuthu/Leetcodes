import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndLastPosition {
//    public int[] searchRange(int[] nums, int target) {
//        List list = new ArrayList<>();
//        for (int num : nums)
//            list.add(num);
//        int a = findTarget(list, target);
//        int b = findTarget(list, target) == -1 ? a : findTarget(list, target);
//        return new int[]{a, b};
//    }
//
//    public int findTarget(List nums, int target) {
//        int start = 0, end = nums.size() - 1, a = -1, b = -1;
//        while (start <= end) {
//            int mid = (start + end) / 2;
//            if (nums.contains(mid)) {
//                nums.remove(mid);
//                return mid;
//            }
//            if ((int) nums.get(mid) > target) end = mid - 1;
//            else start = mid + 1;
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        FirstAndLastPosition firstAndLastPosition = new FirstAndLastPosition();
        System.out.println(Arrays.toString(firstAndLastPosition.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1, a = -1, b = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                a = mid;
                b = mid;
                while (nums[a - 1] == nums[mid] || nums[b + 1] == nums[mid]) {
                    if (nums[a - 1] == nums[mid]) a -= 1;
                    if (nums[b + 1] == nums[mid]) b += 1;
                }
            }
            if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return new int[]{a, b};
    }
}

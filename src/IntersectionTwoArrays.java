
// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]

// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.


import java.util.ArrayList;
import java.util.Arrays;

class IntersectionTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int num: nums2)
            list1.add(num);

        for(int i=0;i<nums1.length;i++){
            if(list1.contains(nums1[i])){
                int index = list1.indexOf(nums1[i]);
                list1.remove(index);
                list2.add(nums1[i]);
            }
        }

        int arr[] = new int[list2.size()];
        for(int k=0;k<list2.size();k++)
            arr[k]=list2.get(k);
        return arr;
    }

    public static void main(String[] args) {
        IntersectionTwoArrays two = new IntersectionTwoArrays();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(two.intersect(nums1,nums2)));
    }
}
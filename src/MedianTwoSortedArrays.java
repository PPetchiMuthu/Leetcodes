
// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int i=0, j=0, k=0;

        while(i<m&&j<n){

            if(nums1[i] > nums2[j]) arr[k++] = nums2[j++];
            else arr[k++] = nums1[i++];
        }

        while(i < m){
            arr[k++] = nums1[i++];
        }

        while(j < n){
            arr[k++] = nums2[j++];
        }

        int mid = arr.length/2;

        if(arr.length%2 == 0)
            return (double)(arr[mid]+arr[mid-1])/2;
        return (double)arr[mid];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nms2 = {2};
        MedianTwoSortedArrays find = new MedianTwoSortedArrays();
        System.out.println(find.findMedianSortedArrays(nums1,nms2));

    }
}
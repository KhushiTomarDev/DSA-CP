//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

package BinarySearch;

public class PeakElementInAMountainArray {
    public static int peakIndexInMountainArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
    
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{2, 3, 4, 5, 8, 4}));
    }
}
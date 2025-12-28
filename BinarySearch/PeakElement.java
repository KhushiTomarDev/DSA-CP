//https://leetcode.com/problems/find-peak-element/description/

package BinarySearch;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
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
        System.out.println(findPeakElement(new int[]{1,2,3,5}));
        System.out.println(findPeakElement(new int[]{2,9,4,9,4,5,8,4}));
    }
    
}

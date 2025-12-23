//https://leetcode.com/problems/move-zeroes/description/

package _01Arrays.Easy;

import java.util.Arrays;

public class MoveZero {
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {3,4,0,52,0,5,6};
        moveZeroes(nums);
        int[] nums1 = {0,0,0,52,0,5,6};
        moveZeroes(nums1);
    }
}

package _01Arrays.Easy;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[] {-2,-3,-5,9,8,6})));
    }
}
    


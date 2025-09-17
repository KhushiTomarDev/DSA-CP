//https://leetcode.com/problems/minimum-size-subarray-sum/description/
package SlidingWindow;

public class MinimumSizeSubArraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum >= target) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                }
                currentSum -= nums[left];
                left++;
            }
        }
        return minLength != Integer.MAX_VALUE ? minLength : 0;
    }
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(5, new int[] {3,45,5,7,4,6}));
    }
    
}

//https://leetcode.com/problems/subarray-product-less-than-k/description/

package TwoPointer;

public class SubarrayProductLessThanK {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        int left = 0, right = 0, product = 1, count = 0;
        int n = nums.length;

        while (right < n) {
            product *= nums[right];
            while (product >= k) product /= nums[left++];
            count += 1 + (right - left);
            right++;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{3,5,4,3,2,3,5,6,7,7,44}, 30));
    }
}

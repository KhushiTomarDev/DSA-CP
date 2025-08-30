//https://leetcode.com/problems/maximum-product-subarray/description/


package Extra;

public class MaximumProductSubArray {
    public static int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int n : nums) {
            res = Math.max(res, n);
        }

        int curMax = 1, curMin = 1;
        for (int n : nums) {
            int temp = curMax * n;
            curMax = Math.max(temp, Math.max(curMin * n, n));
            curMin = Math.min(temp, Math.min(curMin * n, n));

            res = Math.max(res, curMax);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums ={1, 4, 6, 2,9};
        System.out.println(maxProduct(nums));
    }
    
}

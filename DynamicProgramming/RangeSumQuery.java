//https://leetcode.com/problems/range-sum-query-immutable/description/
package DynamicProgramming;
public class RangeSumQuery {
    class NumArray {

        private int[] prefixSum;

        public NumArray(int[] nums) {
            int n = nums.length;
            prefixSum = new int[n + 1];

            prefixSum[0] = 0;
            for (int i = 1; i <= n; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int left, int right) {
            return prefixSum[right + 1] - prefixSum[left];
        }
        
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery outer = new RangeSumQuery();
        NumArray obj = outer.new NumArray(nums);

        System.out.println(obj.sumRange(0, 2)); // Output: 1
        System.out.println(obj.sumRange(2, 5)); // Output: -1
        System.out.println(obj.sumRange(0, 5)); // Output: -3
    }

}

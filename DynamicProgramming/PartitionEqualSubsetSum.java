//https://leetcode.com/problems/partition-equal-subset-sum/description/

package DynamicProgramming;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public static boolean canPartition(int[] nums) {
        int total = Arrays.stream(nums).sum();
        if (total % 2 != 0) return false;

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int n : nums) {
            for (int i = target; i >= n; i--) {
                if (dp[i]) continue;
                if (dp[i - n]) dp[i] = true;
                if (dp[target]) return true;
            }
        }

        return false;        
    }
    public static void main(String[] args){
        System.out.println(canPartition(new int[] {3,4,5,6}));
    }
}

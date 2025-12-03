//https://leetcode.com/problems/target-sum/description/

package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
    
    public static int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> counter = new HashMap<>();
        counter.put(0, 1);

        for (int n : nums) {
            Map<Integer, Integer> temp = new HashMap<>();

            for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
                int total = entry.getKey();
                int count = entry.getValue();

                temp.put(total + n, temp.getOrDefault(total + n, 0) + count);
                temp.put(total - n, temp.getOrDefault(total - n, 0) + count);
            }
            counter = temp;
        }

        return counter.getOrDefault(target, 0);        
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7};
        int target1 = 7;
        int target2 = 1;
        int target3 = 10;
        System.out.println(findTargetSumWays(nums, target1));
        System.out.println(findTargetSumWays(nums, target2));
        System.out.println(findTargetSumWays(nums, target3));
    }

}

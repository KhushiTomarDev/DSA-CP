package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationII {
    public static void backtrack(int i, int[] nums, List<List<Integer>> res) {
        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int x : nums) temp.add(x);
            res.add(temp);
            return;
        }

        Set<Integer> seen = new HashSet<>();

        for (int j = i; j < nums.length; j++) {
            if (seen.contains(nums[j])) continue;

            seen.add(nums[j]);

            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;

            backtrack(i + 1, nums, res);

            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp; // backtrack
        }
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res);
        return res;
    }
    public static void main(String[] args) {
        int[] nums ={2,1,3};
        System.out.println(Arrays.deepToString(permuteUnique(nums)));
    }
    
}

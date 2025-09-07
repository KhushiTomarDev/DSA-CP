//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
package _01Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class AllNumberDisappearedInArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        // Mark visited numbers by negating the index they point to
        for (int num : nums) {
            int idx = Math.abs(num) - 1;  // map number to index
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];   // mark as visited
            }
        }

        // Numbers not visited will have positive values
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {2,3,4,7,8,9,1,2,3,4}));
    }

}

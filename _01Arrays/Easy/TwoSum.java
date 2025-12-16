//https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array

package _01Arrays.Easy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairs = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            int num = nums[i];
            if(pairs.containsKey(target-num)){
                return new int[] {i, pairs.get(target- num)};
            }
            pairs.put(num, i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {3,4,5,6,1},4)));
        System.out.println(Arrays.toString(twoSum(new int[] {3,4,5,6,1},10)));
        
    }
}

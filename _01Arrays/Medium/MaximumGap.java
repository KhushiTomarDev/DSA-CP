//https://leetcode.com/problems/maximum-gap/description/
package _01Arrays.Medium;

import java.util.Arrays;

public class MaximumGap {
     public static int maximumGap(int[] nums) {
        if(nums.length <2){
            return 0;
        }
        Arrays.sort(nums);
        int max=0;
        for(int i =0; i<nums.length-1; i++){
            max = Math.max(max,nums[i+1]- nums[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {3,57,8,4,5};
        System.out.println(maximumGap(nums));
    }

    
}

//https://leetcode.com/problems/contains-duplicate/solutions/

package _01Arrays.Easy;

import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={2,3,4,5};
        int[] nums1={7,8,9};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate(nums1));

    }
}

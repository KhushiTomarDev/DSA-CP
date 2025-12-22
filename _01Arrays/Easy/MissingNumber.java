//https://leetcode.com/problems/missing-number/

package _01Arrays.Easy;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int  n=nums.length;
        int res =n;
        for (int i=0;i<n;i++){
            res+=i-nums[i];

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,0,3,4};
        System.out.println(missingNumber(nums));
         int[] nums1={3,4};
        System.out.println(missingNumber(nums1));
    }
}

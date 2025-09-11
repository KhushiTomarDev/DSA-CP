//https://leetcode.com/problems/product-of-array-except-self/description/

package _01Arrays.Medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
    int[] output = new int[nums.length];
    
    for(int i =0; i<nums.length; i++){
        output[i]=1;
    }

    int left = 1;
    for(int i =0 ; i<nums.length; i++){
        output[i]*=left;
        left*=nums[i];
    }

    int right = 1;
    for(int i = nums.length-1; i>=0; i--){
        output[i]*=right;
        right*=nums[i];
    }
    return output;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {3,4,5,6})));
    }
    
}

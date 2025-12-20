//https://leetcode.com/problems/first-missing-positive/description/

package _01Arrays.Easy;

import java.util.Arrays;

public class FirstMissingPositive {
//--------------------------------Method 1----------------------------------------    

    public static int firstMissingPositive(int[] nums) {
        int base= 1;
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            if(nums[i]==base){
                base++;
            }
        }
        return base;    
}

        public static void main(String[] args) {
            int[] nums= {2,3,0,-1};
            int[] nums1= {-2,-1,0,4};
            
            System.out.println(firstMissingPositive(nums));
            System.out.println(firstMissingPositive(nums1));


        }
}

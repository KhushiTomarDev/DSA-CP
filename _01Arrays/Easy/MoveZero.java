package _01Arrays.Easy;

import java.util.Arrays;

public class MoveZero {
     public static void moveZeroes(int[] nums) {
        int temp;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]){
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] num ={2,3,4,0,3,5,0,5};
        moveZeroes(num);
    }
    
}

//https://leetcode.com/problems/house-robber/description/
package DynamicProgramming;

public class HouseRobber {
   
    public static int rob(int[] nums) {
        int prevRob = 0;
        int maxRob = 0;

        for (int curValue : nums) {
            int temp = Math.max(maxRob, prevRob + curValue);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;        
    }
    public static void main(String[] args) {
        int[] nums= {3,4,5,6,7};
        int[] nums1= {14,9,1,4,1,6,1,2};
        System.out.println(rob(nums));
        System.out.println(rob(nums1));
    }

}

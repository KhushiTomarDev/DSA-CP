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
        System.out.println(rob(nums));
    }

}

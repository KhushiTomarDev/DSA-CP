//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

package _01Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
    //    public static List<Integer> findDuplicates(int[] nums) {
    //     Set<Integer> hs=new HashSet<>();
    //     List<Integer> ans=new ArrayList<>();
    //     for(int x:nums){
    //         boolean f=hs.add(x);
    //         if(!f)
    //             ans.add(x);
    //     }
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     System.out.println(findDuplicates(new int[]{2,3,4,2,4,5,6,7,4,3,2}));
    //     System.out.println(findDuplicates(new int[]{   4,5,6,7,4,3,2}));
    //     System.out.println(findDuplicates(new int[]{2,3,4,2,4,7,4,3,2}));
    // }

    
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            int idx = num - 1;
            if (nums[idx] < 0)
                result.add(num);
            nums[idx] *= -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4,3,5};
        System.out.println(findDuplicates(nums));
    }


    
}

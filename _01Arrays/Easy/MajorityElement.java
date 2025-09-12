//https://leetcode.com/problems/majority-element/description/

package _01Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
     public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }

        return res;        
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {2,3,4,23,4,3,4,4,3,4}));
    }
    
}

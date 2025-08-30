//https://leetcode.com/problems/single-number/
package _01Arrays.Easy;

//--------------------LOGIC----------------------------------------------------------------
//XOR of every number with itself is 0, and any number XOR 0 is that number itself
//example 7^7=0 and 7^0=7, since we have 2 pair of each they will cancel out ie will give 
//0 and 0 XOR that single number will give that single number only:)
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums ={2,3,4,2,3,4,5,5,7};
        System.out.println(singleNumber(nums));
    }

}

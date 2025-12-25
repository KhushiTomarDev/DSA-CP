//https://leetcode.com/problems/find-the-duplicate-number/description/
//Floyds turtoise and hare algorithm used

package _01Arrays.Medium;

public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        int slow2 = nums[0];

        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow;
    }
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{3,4,5,3,7,6}));
        System.out.println(findDuplicate(new int[]{3,4,7,6}));
    }
}

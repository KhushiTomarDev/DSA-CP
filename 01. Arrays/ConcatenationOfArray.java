
//https://leetcode.com/problems/concatenation-of-array/description/
import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {

    // --------------------METHOD 1--------------------------
    public static int[] getConcatenationMethodOne(int[] nums) {
        int arrLength = 2 * nums.length;
        int[] resultArr = new int[arrLength];
        System.arraycopy(nums, 0, resultArr, 0, nums.length);
        System.arraycopy(nums, 0, resultArr, nums.length, nums.length);
        return resultArr;
    }

    //----------------------METHOD 2-------------------------
    public static int[] getConcatenationMethodTwo(int[] nums) {
        int arrLength = nums.length;
        int[] resultArr = new int[2 * arrLength];
        for (int i = 0; i < arrLength; i++) {
            resultArr[i] = nums[i];
            resultArr[i + arrLength] = nums[i];

        }
        return resultArr;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the size of array : ");
            int n = input.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(getConcatenationMethodTwo(nums)));
        }
    }
}

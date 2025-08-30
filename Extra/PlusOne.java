//https://leetcode.com/problems/plus-one/description/

package Extra;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] answer = new int[digits.length + 1];
        answer[0] = 1;
        return answer;
    }
    public static void main(String[] args) {
        int[] num = {1,0, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(num)));
    }

    
}

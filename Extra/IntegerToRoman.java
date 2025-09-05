//https://leetcode.com/problems/integer-to-roman/description/

package Extra;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            if (num == 0) {
                break;
            }
            while (num >= values[i]) {
                ans.append(symbols[i]);
                num -= values[i];
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(786));
        System.out.println(intToRoman(0));
        System.out.println(intToRoman(35));
    }    
}

//https://leetcode.com/problems/palindromic-substrings/

package DynamicProgramming;

public class PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += resultPal(s, i, i);
            result += resultPal(s, i, i + 1);
        }
        return result;
    }

    public static int resultPal(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
}

//https://leetcode.com/problems/word-break/description/

package DynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (String w : wordDict) {
                int start = i - w.length();
                if (start >= 0 && dp[start] && s.substring(start, i).equals(w)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];        
    }
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "Sample";
        List<String> a1 = Arrays.asList("Leet", "code");
        List<String> a2 = Arrays.asList("leet", "code");
        List<String> a3 = Arrays.asList("Sam", "ple");
        List<String> a4 = Arrays.asList("Sam", "les");
        System.out.println(wordBreak(s1, a1));
        System.out.println(wordBreak(s1, a2));
        System.out.println(wordBreak(s2, a3));
        System.out.println(wordBreak(s2, a4));
    }

}

//https://leetcode.com/problems/reverse-words-in-a-string/submissions/1749249253/

package Extra;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] words = s.split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(reverseWords(" Hello World! "));
    }
    
}

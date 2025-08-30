package Extra;

//https://leetcode.com/problems/length-of-last-word/submissions/1744623351/

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
    public static void main(String[] args){
        String s="Raja babu";
        System.out.println("The length of last word is : " + lengthOfLastWord(s));
    }
   
    
}

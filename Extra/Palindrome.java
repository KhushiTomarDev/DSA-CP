//https://leetcode.com/problems/palindrome-number/
package Extra;


class Palindrome{
    public static boolean isPalindrome(int x) {
        int new1 = 0;
        int rem , num=x;
        
        if (x<0){
            return false;
        }
        else{
            while(num!=0){
                 rem = num%10;
                 new1 =new1*10+ rem;
                 num=num/10;
            }
            return new1 == x; 
        }
        
        
    }
    public static void main(String[] args) {
        int x=212;
        System.out.println("Is the number 212 Palindrome : "+ isPalindrome(x));
    }
}
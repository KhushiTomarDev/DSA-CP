//https://leetcode.com/problems/factorial-trailing-zeroes/description/

package Extra;

public class TrailingZeroes {

    public static int trailingZeroes(int n) {
        int count = 0;
        while (n != 0) {
            int tmp = n / 5;
            count += tmp;
            n = tmp;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(trailingZeroes(30));
    }

}

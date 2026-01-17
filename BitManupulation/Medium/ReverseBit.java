//https://leetcode.com/problems/reverse-bits/description/

package BitManupulation.Medium;


public class ReverseBit {

    public static int reverseBits(int n) {

        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;

            result |= n & 1;

            n >>>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
        System.out.println(reverseBits(987));
        System.out.println(reverseBits(44));
    }

}

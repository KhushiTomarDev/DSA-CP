//https://leetcode.com/problems/minimum-array-end/description/

package BitManupulation.Medium;

public class MinimumArrayEnd {

    public static long minEnd(int n, int x) {
        long result = x;
        long remaining = n - 1;
        long position = 1;
        
        while (remaining != 0) {
            if ((x & position) == 0) {
                result |= (remaining & 1) * position;
                remaining >>= 1;
            }
            position <<= 1;
        }
        
        return result;
    }
    public static void main(String[] args) {
        System.out.println(minEnd(3, 4));
    }

}

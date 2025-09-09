//https://leetcode.com/problems/convert-1d-array-into-2d-array/description/

package _01Arrays.Easy;

import java.util.Arrays;

public class OneDto2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(construct2DArray(new int[] {2,34,4,5}, 2, 2)));
    }

    
}

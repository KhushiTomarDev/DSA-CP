//https://leetcode.com/problems/unique-paths/description/


package DynamicProgramming;

import java.util.Arrays;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[] aboveRow = new int[n];
        Arrays.fill(aboveRow, 1);

        for (int row = 1; row < m; row++) {
            int[] currentRow = new int[n];
            Arrays.fill(currentRow, 1);
            for (int col = 1; col < n; col++) {
                currentRow[col] = currentRow[col - 1] + aboveRow[col];
            }
            aboveRow = currentRow;
        }

        return aboveRow[n - 1];        
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(6, 7));
        System.out.println(uniquePaths(5, 8));
    }

}

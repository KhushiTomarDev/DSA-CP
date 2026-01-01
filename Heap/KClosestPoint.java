//https://leetcode.com/problems/k-closest-points-to-origin/description/


import java.util.Arrays;

public class KClosestPoint {
    public static int[][] kClosest(int[][] points, int k) {


         Arrays.sort(points, (a, b) -> 
            (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1])
        );
        return Arrays.copyOfRange(points, 0, k);

}
public static void main(String[] args) {
    int[][] points = {{1, 3}, {-2, 2}};
    int[][] points1 = {{2, 8}, {-9, 1}};
    int k = 1;
    System.out.println(Arrays.deepToString(kClosest(points1, k)));
    System.out.println(Arrays.deepToString(kClosest(points, k)));
}
    
}

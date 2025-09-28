//https://leetcode.com/problems/container-with-most-water/description/

package TwoPointer;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;        
    }
    public static void main(String[] args) {
        int[] water = {3,4,56,7,8,9,3};
        System.out.println(maxArea(water));
    }
}


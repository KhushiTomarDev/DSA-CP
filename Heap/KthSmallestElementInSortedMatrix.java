import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {
     public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> nums = new PriorityQueue<>(Collections.reverseOrder());
        //max heap
        for(int[] row : matrix){
            for(int val : row){
                nums.offer(val);
                if(nums.size()>k){
                    nums.poll();
                }

            }
        }
            return nums.peek();
    }
    public static void main(String[] args) {
        int[][] nums = {{2,3},{4,5}};
        System.out.println(kthSmallest(nums, 2));
        //  int[][] nums1 = {{4,5}};
        // System.out.println(kthSmallest(nums, 1));
    }
}

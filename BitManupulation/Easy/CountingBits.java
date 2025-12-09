//https://leetcode.com/problems/counting-bits/description/

package BitManupulation.Easy;

import java.util.Arrays;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] NumOne = new int[n+1];
        NumOne[0]=0;

        for(int i =1; i<=n;i++){
            NumOne[i]= NumOne[i/2]+(i%2);
        }
        return NumOne;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(countBits(5)));
        System.out.println(Arrays.toString(countBits(56)));
    }
}

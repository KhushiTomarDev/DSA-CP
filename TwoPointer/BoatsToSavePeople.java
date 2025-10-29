//https://leetcode.com/problems/boats-to-save-people/description/
package TwoPointer;

import java.util.Arrays;

public class BoatsToSavePeople {
   
    public static int numRescueBoats(int[] people, int limit) {
        int boatCount = 0;
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right){
            int sum = people[left] + people[right];
            if(sum <= limit){
                boatCount++;
                left++;
                right--;
            }
            else{
                boatCount++;
                right--;
            }
        }
        return boatCount;
    }
    public static void main(String[] args) {
        int[] people = {2,3,4,9,8,7,6};
        int limit = 10;
        System.out.println(numRescueBoats(people, limit));
    }
}

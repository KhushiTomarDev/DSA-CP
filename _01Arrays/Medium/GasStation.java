//https://leetcode.com/problems/gas-station/description/

package _01Arrays.Medium;

public class GasStation {
   
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int totalGas = 0;
        int currentGas = 0;

        for (int i = 0; i < gas.length; i++) {
            int fuelGain = gas[i] - cost[i];
            totalGas += fuelGain;
            currentGas += fuelGain;

            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return totalGas < 0 ? -1 : start;        
    }

    public static void main(String[] args) {
        int[] gas = {3,4,5,6};
        int[] gas1 = {76,34};
        int[] cost = {3,4,8,6};
        int[] cost1 = {33,66};
        System.out.println(canCompleteCircuit(gas, cost));
        System.out.println(canCompleteCircuit(gas1, cost1));
    }

}

//https://leetcode.com/problems/lemonade-change/description/

package Greedy;

public class LemonadeChange {


        public static boolean lemonadeChange(int[] bills) {
            int five= 0, ten = 0;
            for (int i = 0; i < bills.length; ++i) {
                if (bills[i] == 5) {
                    five += 1;
                } else if (bills[i] == 10) {
                    if (five == 0) {
                        return false;
                    }
                    five -= 1;
                    ten += 1;
                } else {
                    if (!(five > 2) && !(five > 0 && ten > 0)) {
                        return false;
                    }

                    if (five > 0 && ten > 0) {
                        five -= 1;
                        ten -= 1;
                    } else {
                        five -= 3;
                    }
                }
            }
            return true;
        }
    public static void main(String[] args) {
        int[] bills = {2,3,45,66};
        int[] bills1 = {3,8,9,6};
    }
    System.out.println(lemonadeChange(bills));
    //System.out.println(lemonadeChange(bills1));
}

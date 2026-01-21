package Extra;

import java.util.Scanner;

public class BouncyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number ");
        int a = sc.nextInt();
        if(isBouncy(a)){
            System.out.println(a+ " is a bouncy number");
        }
        else
        System.out.println(a+" is not a bouncy number");
        
    }
    public static boolean isBouncy(int n){
        int inc =0;
        int dec =0;
        
        int lastDigit= n%10;
        n/=10;

        while(n>0){
            int currentDigit = n%10;
            if (currentDigit>lastDigit){
                dec=1;
            }
            else if(currentDigit<lastDigit){
                inc=1;
            }

            if(inc==1 && dec ==1){
                return true;
            }
            lastDigit=currentDigit;
            n/=10;

        }
        return false;

    }
}

//https://leetcode.com/problems/add-binary/

package Extra;

public class AddBinary {
     public static String addBinary(String a, String b) {
        int d = Integer.parseInt(a,2);
        int e = Integer.parseInt(b,2);
        int sum = d+e;
        
        return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
        String a = "1100";
        String b = "1110";
        System.out.println(addBinary(a, b));
    }
    


    
}

//https://leetcode.com/problems/excel-sheet-column-title/description/

package Extra;

public class ExcelSheetColumnTitle {
      public static String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            res.insert(0, (char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }
        
        return res.toString();        
    }
    public static void main(String[] args) {
        System.out.println(convertToTitle(100));
    }
    
}

package leedecodePregram;
//Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
//
//For example:
//
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28
//...
//
//
//Example 1:
//
//Input: columnNumber = 1
//Output: "A"
//Example 2:
//
//Input: columnNumber = 28
//Output: "AB"
//Example 3:
//
//Input: columnNumber = 701
//Output: "ZY"
public class Excel_Sheet_Column_Title_168 {
    public static void main(String[] args) {
        int n=754;
        System.out.print(convertToTitle(n));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();

        while(columnNumber>0){

            int rem=columnNumber%26;
            columnNumber=columnNumber/26;
            if(rem==0){
                sb.append('Z');
                columnNumber--;
            }
            else{
                sb.append((char)(rem+64));
            }

        }

        return sb.reverse().toString();
    }
}

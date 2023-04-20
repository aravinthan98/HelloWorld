package string;

public class zigzagConversionleedcode6 {
    public static void main(String[] args) {
        String s="PAYPALISHIRING";
        int numRows=4;
        //Input: s = "PAYPALISHIRING", numRows = 4
        //Output: "PINALSIGYAHRPI"
        //Explanation:
        //P     I    N
        //A   L S  I G
        //Y A   H R
        //P     I

        System.out.println(convert(s,numRows));
    }
    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        if(numRows==1){
            return s;
        }
        int cal=3;
        int itr=2*numRows;
        for(int j=0;j<numRows;j++){
            boolean value=true;
            int i=j;
            while(i<n){
                sb=sb.append(s.charAt(i));
                if(j==0||j==numRows-1){
                    i+=(2*numRows-2);
                }
                else{
                    if(value){
                        i+=(2*(numRows-j)-2);
                    }
                    else{
                        i+=j*2;
                    }
                    value^=true;
                }

            }

        }
        return sb.toString();
    }
}


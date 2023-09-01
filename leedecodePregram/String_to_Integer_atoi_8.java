package leedecodePregram;

public class String_to_Integer_atoi_8 {
    public static void main(String[] args) {
        String s="words and 987";
        System.out.print(myAtoi(s));
    }
    public static int myAtoi(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        while(i<s.length()){
            if(s.charAt(i)=='-' || s.charAt(i)=='+'){
                if(sb.length()==0){
                    sb.append(s.charAt(i));
                    i++;
                }
                else{
                    break;
                }

            }
            else if(s.charAt(i)-'0'<=9 && s.charAt(i)-'0'>=0){
                sb.append(s.charAt(i));

                i++;
            }
            else if(s.charAt(i)>9 || s.charAt(i)<0){
                break;
            }
        }
        try{
            String k=sb.toString();
            double m=Double.parseDouble(k);
            if(m > Integer.MAX_VALUE ){
                return Integer.MAX_VALUE;
            }
            else if(m<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            return Integer.parseInt(k);
        } catch(NumberFormatException nfe){
            return 0;
        }
    }
}

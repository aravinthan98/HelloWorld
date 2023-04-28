package Hashproblem;

import java.util.HashMap;

public class CheckifNumberHasEqualDigitCountandDigitValue2283 {
    public static void main(String[] args) {
        String s="1210";
        System.out.print(digitCount(s));
    }
    public static boolean digitCount(String num) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<num.length();i++){
            int ch=num.charAt(i)-'0';
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<num.length();i++){

            if(map.containsKey(i)){
                count=map.get(i);
            }
            else {
                count=0;
            }
            int x=num.charAt(i)-'0';
            if(x!=count){
                return false;
            }
//            sb.append(count);
//          if(num.equals(sb.toString())){
//              return true;
//          }
        }
      return true;
    }
}


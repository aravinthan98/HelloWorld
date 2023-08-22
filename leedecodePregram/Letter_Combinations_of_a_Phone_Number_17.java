package leedecodePregram;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number_17 {
    public static void main(String[] args) {
        String digits="23";
        List<String>result=letterCombinations(digits);
    }
        public static List<String> letterCombinations(String digits) {
            int k=digits.length();

            String[] sarr=new String[k];
            for(int i=0;i<k;i++){
                sarr[i]=findletters(digits.charAt(i));
            }

            List<String> ans = new ArrayList<>();
            findCombinations(0,sarr, k, ans, new StringBuilder());
            return ans;
        }
        public static void findCombinations(int i,String[] str, int k,List <String > ans,  StringBuilder sb) {

            if(sb.length()==k){
                ans.add(sb.toString());
                return;
            }
            if (i== str.length) {
                return;
            }

            for(int l=0;l<str[i].length();i++){
                sb.append(str[i].charAt(l));
                findCombinations(i+1, str, k, ans, sb);
                sb.deleteCharAt(sb.length() - 1);
            }


            // findCombinations(i,j+1, str, k, ans, sb);
        }
        public static String findletters(char ch){
            String s="";
            switch(ch){
                case '2':
                    s="abc";
                    break;

                case '3':
                    s="def";
                    break;

                case '4':
                    s="ghi";
                    break;

                case '5':
                    s="jkl";
                    break;
                case '6':
                    s="mno";
                    break;
                case '7':
                    s="pqrs";
                    break;
                case '8':
                    s="tuv";
                    break;
                case '9':
                    s="wxyz";
                    break;
            }
            return s;
        }

}

package leedecodePregram.dynamic_programming;

public class Longest_Palindromic_Substring_5 {
    public static void main(String[] args) {
        String s="babad";
        System.out.print(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);

        String maxLen="";

        String str=sb.reverse().toString();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<str.length();j++){
                if(s.charAt(i)==str.charAt(j)){
                    if(s.substring(i,s.length()-j).equals(str.substring(j,str.length()-i))){
                        if(maxLen.length()<s.substring(i,s.length()-j).length()){
                            maxLen=s.substring(i,s.length()-j);
                        }

                    }

                }

            }
        }

        return maxLen;

    }
}

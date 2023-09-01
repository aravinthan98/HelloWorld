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
    //best solution
    //  private int lo, maxLen;
    //    public String longestPalindrome(String s) {
    //
    //      int len = s.length();
    //      if (len < 2)
    //        return s;
    //
    //    for (int i = 0; i < len-1; i++) {
    //     	extendPalindrome(s, i, i);
    //     	extendPalindrome(s, i, i+1);
    //    }
    //    return s.substring(lo, lo + maxLen);
    //    }
    //    private void extendPalindrome(String s, int j, int k) {
    //      while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
    //        j--;
    //        k++;
    //      }
    //      if (maxLen < k - j - 1) {
    //        lo = j + 1;
    //        maxLen = k - j - 1;
    //      }
    //
    //    }
    //ANother one
    //       public String longestPalindrome(String s) {
    //           int n = s.length();
    //        String result = s.substring(0,1);
    //        for(int i=0; i<n; i++) {
    //            String temp = "";
    //            // Even check
    //            temp = check(s, i, i);
    //            if(temp.length() > result.length()) {
    //                result = temp;
    //            }
    //            // Odd Check
    //            temp = check(s, i, i+1);
    //            if(temp.length() > result.length()) {
    //                result = temp;
    //            }
    //        }
    //        return result;
    //    }
    //
    //    private String check(String str, int l, int r) {
    //        int n = str.length();
    //        while(l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
    //            l--;
    //            r++;
    //        }
    //        return str.substring(l+1, r);
    //    }
}

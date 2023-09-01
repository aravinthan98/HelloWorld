package leedecodePregram;

import java.util.Arrays;

public class Longest_Palindromic_Subsequence_516 {
    public static void main(String[] args) {
        String s="bbbab";
        System.out.print(longestPalindromeSubseq(s));
    }
    public static int longestPalindromeSubseq(String s) {

        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return longestPalindromeSubseqhelper(s,0,s.length()-1,dp);
    }
    public static int longestPalindromeSubseqhelper(String s,int i,int j,int[][] dp){
        if(i==j){
            return 1;
        }
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]= 2+longestPalindromeSubseqhelper(s,i+1,j-1,dp);
            return dp[i][j];
        }

        dp[i][j]= Math.max(longestPalindromeSubseqhelper(s,i+1,j,dp),longestPalindromeSubseqhelper(s,i,j-1,dp));

        return dp[i][j];

    }
}


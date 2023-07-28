package leedecodePregram.dynamic_programming;

import java.util.Arrays;
//abcde
//ace
//
//
//Output:
//3
//
//Explanation:
//The longest common subsequence of text1 and text2 is "ace" with a length of 3.
public class Longest_Common_Subsequence_1143 {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
        System.out.print(longestCommonSubsequence(s1,s2));
    }
    public static int longestCommonSubsequence(String s1, String s2) {
        char[] string1=s1.toCharArray();
        char[] string2=s2.toCharArray();

        int len1=string1.length;
        int len2=string2.length;
        int[][] dp=new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++){
            Arrays.fill(dp[i],-1);
        }
        return longestCommonSubsequencehelper(string1,string2,len1,len2,dp);
    }
    public static int longestCommonSubsequencehelper(char[] arr1,char[] arr2,int i,int j,int[][] dp){
        if(i==0||j==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(arr1[i-1]==arr2[j-1]){
            dp[i][j]= 1+ longestCommonSubsequencehelper(arr1,arr2,i-1,j-1,dp);
            return dp[i][j];
        }
        dp[i][j]= Math.max(longestCommonSubsequencehelper(arr1,arr2,i-1,j,dp),longestCommonSubsequencehelper(arr1,arr2,i,j-1,dp));
        return dp[i][j];

    }
    //   ------------Another way to understand simply------------
    //    public int longestCommonSubsequence(String text1, String text2) {
    //        int n = text1.length();
    //        int m = text2.length();
    //        int maxLen = 0;
    //
    //        int[][] dp = new int[n + 1][m + 1];
    //
    //        for (int i = 0; i <= n; i++) {
    //            for (int j = 0; j <= m; j++) {
    //                if(i==0||j==0){
    //                     dp[i][j]=0;
    //                }
    //                else if (text1.charAt(i-1) == text2.charAt(j-1)) {
    //                    dp[i][j] = dp[i - 1][j - 1] + 1;
    //
    //                }
    //                else{
    //                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
    //                }
    //
    //            }
    //
    //        }
    //        return dp[n][m];
    //    }
}

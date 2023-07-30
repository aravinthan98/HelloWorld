package Dynamic_programming;

import java.util.Arrays;

public class Lcs_Substring {
    public static void main(String[] args) {
       String s1= "abcd";
       String s2= "acdf";
       System.out.print(longestCommonSubstring(s1,s2));
    }
    static int maxlength=0;
    public static int longestCommonSubstring(String s1, String s2) {
        char[] string1=s1.toCharArray();
        char[] string2=s2.toCharArray();

        int len1=string1.length;
        int len2=string2.length;
        int[][] dp=new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++){
            Arrays.fill(dp[i],-1);
        }
        int length= longestCommonSubstringhelper(string1,string2,len1,len2,dp);
        return maxlength;
    }
    public static int longestCommonSubstringhelper(char[] arr1,char[] arr2,int i,int j,int[][] dp){
        if(i==0||j==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(arr1[i-1]==arr2[j-1]){
            int length= 1+ longestCommonSubstringhelper(arr1,arr2,i-1,j-1,dp);
            maxlength=Math.max(length,maxlength);

            dp[i][j]=length;
            return length;
        }
        dp[i][j]=longestCommonSubstringhelper(arr1,arr2,i-1,j,dp);
        dp[i][j]=longestCommonSubstringhelper(arr1,arr2,i,j-1,dp);
        return 0;

    }
}

package leedecodePregram.dynamic_programming;

import java.util.Arrays;

public class Maximum_Length_of_Repeated_Subarray_718 {
    public static void main(String[] args) {
//        String s1="abcde";
//        String s2="aecd";
        int[] nums1= {1,2,3,2,1};
        int[] nums2 = {3,2,1,4,7};
        System.out.print(longestCommonSubstring(nums1,nums2));
    }
    static int maxlength=0;
    public static int longestCommonSubstring(int[] nums1, int[] nums2) {
//        char[] string1=s1.toCharArray();
//        char[] string2=s2.toCharArray();

        int len1=nums1.length;
        int len2=nums2.length;
        int[][] dp=new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++){
            Arrays.fill(dp[i],-1);
        }
        int length= longestCommonSubstringhelper(nums1,nums2,len1,len2,dp);
        return maxlength;
    }
    public static int longestCommonSubstringhelper(int[] arr1,int[] arr2,int i,int j,int[][] dp){
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

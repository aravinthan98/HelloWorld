package leedecodePregram.dynamic_programming;

import java.util.Arrays;
//You are a professional robber planning to rob houses along a street.
// Each house has a certain amount of money stashed, the only constraint stopping you from robbing
// each of them is that adjacent houses have security systems connected and it will automatically contact
// the police if two adjacent houses were broken into on the same night.
//
//Given an integer array nums representing the amount of money of each house, return the maximum
// amount of money you can rob tonight without alerting the police.
public class House_Robber_198 {
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.print(rob(nums));
    }
    public static int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return robhelper(nums,nums.length,dp);
    }
    public static int robhelper(int[] num,int n,int[] dp){
        if(n<=0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= Math.max(robhelper(num,n-2,dp)+num[n-1],robhelper(num,n-1,dp));

        return dp[n];
    }
}

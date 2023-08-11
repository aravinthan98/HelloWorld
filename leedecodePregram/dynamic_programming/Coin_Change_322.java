package leedecodePregram.dynamic_programming;

import java.util.Arrays;

public class Coin_Change_322 {
    public static void main(String[] args) {
        int[] arr={1,2,5};
        int target=11;
        System.out.print(coinChange(arr,target));
    }
    public static int coinChange(int[] coins, int target) {
        int ans= changehelper(coins,target,coins.length-1);
        if(ans>=100000){
            return -1;
        }
        return ans;
    }
    public static int changehelper(int[] coins,int target,int n){
        if(n==0){
            if(target%coins[0]==0){
                return target/coins[0];
            }
            return 100000;
        }

        int nottake=0+changehelper(coins,target,n-1);
         int take=Integer.MAX_VALUE;

        if(coins[n]<=target){
            take= 1+changehelper(coins,target-coins[n],n);

        }

         return Math.min(take,nottake);
    }
    }
    ///---------------Another Way --------------------------
//     public int coinChange(int[] coins, int target) {
//        int[][] dp=new int[coins.length][target+1];
//        for(int i=0;i<coins.length;i++){
//            Arrays.fill(dp[i],-1);
//        }
//     int ans= changehelper(coins,target,coins.length-1,dp);
//     if(ans>=100000){
//         return -1;
//     }
//     return ans;
//    }
//    public int changehelper(int[] coins,int target,int n,int[][] dp){
//        if(n==0){
//            if(target%coins[0]==0){
//                return target/coins[0];
//            }
//            return 100000;
//        }
//        if(dp[n][target]!=-1){
//            return dp[n][target];
//        }
//        int nottake=0+changehelper(coins,target,n-1,dp);
//         int take=Integer.MAX_VALUE;
//
//        if(coins[n]<=target){
//            take= 1+changehelper(coins,target-coins[n],n,dp);
//
//        }
//        dp[n][target]=Math.min(take,nottake);
//         return dp[n][target];
//    }


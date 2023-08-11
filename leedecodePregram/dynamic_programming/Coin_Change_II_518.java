package leedecodePregram.dynamic_programming;

import java.util.Arrays;

//You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
//
//Return the number of combinations that make up that amount. If that amount of money cannot be made up by any combination of the coins, return 0.
//
//You may assume that you have an infinite number of each kind of coin.
//
//The answer is guaranteed to fit into a signed 32-bit integer.
public class Coin_Change_II_518 {
    public static void main(String[] args) {
        int[] arr={1,2,5};
        int target=5;
        System.out.print(change(target,arr));
    }
    public static int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return findCombinations(coins.length-1,amount, coins,dp);
    }
    public static int findCombinations(int ind,int target, int[] arr,int[][] dp ) {

        if (ind ==0) {
            return (target%arr[ind]==0)?1:0;
        }
        if(dp[ind][target]!=-1){
            return dp[ind][target];
        }
        int nottake=findCombinations(ind -1,target, arr,dp);
        int take=0;
        if (arr[ind] <= target) {
            take= findCombinations(ind, target - arr[ind], arr,dp);
        }

        dp[ind][target]=take+nottake;
        return dp[ind][target];
    }
    //----------------------Another way --------------
    //public int change(int amount, int[] coins) {
    //       int[][] dp = new int[coins.length][amount+1];
    //      for(int i=0;i<=amount;i++){
    //         dp[0][i]=i%coins[0]==0?1:0;
    //      }
    //
    //        for(int i=1;i<coins.length;i++){
    //            for(int j=0;j<=amount;j++){
    //                int nottake=dp[i-1][j];
    //                int take=0;
    //                if(coins[i]<=j){
    //                    take=dp[i][j-coins[i]];
    //                }
    //                dp[i][j]=take+nottake;
    //            }
    //        }
    //        return dp[coins.length-1][amount];
    //    }
}

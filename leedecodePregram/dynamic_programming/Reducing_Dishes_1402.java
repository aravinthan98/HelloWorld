package leedecodePregram.dynamic_programming;

import java.util.Arrays;
//A chef has collected data on the satisfaction level of his n dishes. Chef can cook any dish in 1 unit of time.
//
//Like-time coefficient of a dish is defined as the time taken to cook that dish including previous dishes multiplied by its satisfaction level i.e. time[i] * satisfaction[i].
//
//Return the maximum sum of like-time coefficient that the chef can obtain after dishes preparation.
//
//Dishes can be prepared in any order and the chef can discard some dishes to get this maximum value.

public class Reducing_Dishes_1402 {
    public static void main(String[] args) {
        int[] satisfaction={-8,-7,-1,0,5};

        System.out.print(maxSatisfaction(satisfaction));
    }
    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int[][] dp=new int[satisfaction.length+1][satisfaction.length+1];
        for(int i=0;i<=satisfaction.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return maxSatisfactionhelper(satisfaction,satisfaction.length,1,1,dp);
    }
    public static int maxSatisfactionhelper(int[] arr,int n,int i,int j,int[][] dp){
        if(i>n||j>n){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        dp[i][j]= Math.max((arr[i-1]*j)+maxSatisfactionhelper(arr,n,i+1,j+1,dp),maxSatisfactionhelper(arr,n,i+1,j,dp));

        return dp[i][j];
    }
}

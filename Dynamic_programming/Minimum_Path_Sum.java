package Dynamic_programming;

import java.util.Arrays;

public class Minimum_Path_Sum {
    public static void main(String[] args) {
        int m=3;
        int n=3;
       int[][] arr={{1,3,1},{1, 5, 1},{4, 2, 1}};
       System.out.print(minPathSum(n,m,arr));
    }
    public static int minPathSum(int n, int m, int[][] grid) {
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return minPathSumhelper(n-1, m-1,grid,dp);


    }

    public static int minPathSumhelper(int n,int m,int[][] arr,int[][] dp){
        if(n==0&&m==0){
            dp[n][m]=arr[n][m];
            return dp[n][m];
        }
        if(n<0||m<0){
            return Integer.MAX_VALUE;
        }

        if(dp[n][m]!=-1){
            return dp[n][m];
        }

        dp[n][m]=arr[n][m]+ Math.min(minPathSumhelper(n-1,m,arr,dp),
                minPathSumhelper(n,m-1,arr,dp));

        return dp[n][m];

    }
}

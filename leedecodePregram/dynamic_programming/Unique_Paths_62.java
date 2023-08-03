package leedecodePregram.dynamic_programming;

import java.util.Arrays;

public class Unique_Paths_62 {
    public static void main(String[] args) {
        int n=3;
        int m=4;
        System.out.print(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return uniquePathshelper(m, n,0,0,dp);


    }

    public static int uniquePathshelper(int m,int n,int i,int j,int[][] dp){

        if(i>=m||j>=n){
            return 0;
        }
        if(i==m-1&&j==n-1){
            dp[i][j]=1;
            return dp[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        dp[i][j]= uniquePathshelper(m,n,i+1,j,dp)+uniquePathshelper(m,n,i,j+1,dp);

        return dp[i][j];

    }
}

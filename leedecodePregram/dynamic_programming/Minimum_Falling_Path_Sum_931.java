package leedecodePregram.dynamic_programming;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_931 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(minFallingPathSum(matrix));
    }
    public static int minFallingPathSum(int[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            Arrays.fill(dp[i],15000);
        }
        int max=15000;
        for(int i=0;i<matrix[0].length;i++){
            max=Math.min(max,findminfallpath(matrix.length-1,i,matrix,dp));
            if(max==0){
                break;
            }
        }
        return max;
    }
    public static int findminfallpath(int i,int j,int[][] arr,int[][] dp){
        if(i<0){

            return 0;
        }
        if(j<0||j>=arr[0].length){
            return 100000000;
        }

        if(dp[i][j]!=15000){
            return dp[i][j];
        }
        int x=findminfallpath(i-1,j-1,arr,dp);
        int y=findminfallpath(i-1,j+1,arr,dp);
        int z=findminfallpath(i-1,j,arr,dp);
        return dp[i][j]=arr[i][j]+minimum(x,y,z);
    }
    public static int minimum(int x,int y,int z){
        if(x<y){
            return x<z?x:z;
        }
        return y<z?y:z;
    }
}

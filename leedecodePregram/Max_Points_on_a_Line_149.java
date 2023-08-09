package leedecodePregram;

import java.util.ArrayList;

public class Max_Points_on_a_Line_149 {
    public static void main(String[] args) {
        int[][] arr={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};

        System.out.print(maxPoints(arr));
    }
    public static int maxPoints(int[][] points) {
        int[][] dp=new int[points.length+1][points.length+1];
        for(int i=0;i<points.length;i++){
            dp[points[i][0]][points[i][1]]=1;
        }
        int max=0;
        int sideval=0;

        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<dp.length;i++){
            int rowval=0;
            int downval=0;
            for(int j=1;j<dp.length-1;j++){
                if(i==j){
                   sideval+= dp[i][j];
                }
                rowval+=dp[i][j];
                downval+=dp[j][i];


                max=Math.max(max,dp[i][j]);
            }
        }
//----------incomplete---------------
        return max;
    }
}

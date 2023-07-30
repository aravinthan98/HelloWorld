package leedecodePregram.dynamic_programming;
//You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
//
//You can either start from the step with index 0, or the step with index 1.
//
//Return the minimum cost to reach the top of the floor.
public class Min_Cost_Climbing_Stairs_746 {
    public static void main(String[] args) {
        int[] cost={10,15,20};
        int dp1=cost[1];
        int dp2=cost[0];

        for(int i=2;i<cost.length;i++){
            int dp0=(dp1<dp2?dp1:dp2) +cost[i];

            dp2=dp1;
            dp1=dp0;
        }
        System.out.print(Math.min(dp1,dp2));
    }
}

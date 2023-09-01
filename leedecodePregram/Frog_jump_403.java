package leedecodePregram;

import java.util.HashMap;

public class Frog_jump_403 {
    public static void main(String[] args) {
        int[] arr={0,1,3,5,6,8,12,17};
        System.out.print(canCross(arr));
    }
    public static boolean canCross(int[] stones) {
        if(stones[1]-stones[0]>1){
            return false;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<stones.length;i++){
            map.put(stones[i],i);
        }
        Boolean[][] dp=new Boolean[stones.length][stones.length+1];

        return canCrosshelper(stones,1,1,map,dp);

    }
    public static boolean canCrosshelper(int[] arr,int i,int k,HashMap<Integer,Integer>map,Boolean[][]dp){
        if(i==arr.length-1){
            return true;
        }
        if(k==0){
            return false;
        }
        if(dp[i][k]!=null){
            return dp[i][k];
        }
        boolean left=false;
        boolean right=false;
        boolean mid=false;
        if(map.containsKey(k+arr[i]+1)){
            left=canCrosshelper(arr,map.get(k+arr[i]+1),k+1,map,dp);
        }
        if(map.containsKey(k+arr[i])){
            mid=canCrosshelper(arr,map.get(k+arr[i]),k,map,dp);
        }
        if(map.containsKey(k+arr[i]-1)){
            right= canCrosshelper(arr,map.get(k+arr[i]-1),k-1,map,dp);
        }
        dp[i][k]=left||mid||right;
        return dp[i][k];
    }
}

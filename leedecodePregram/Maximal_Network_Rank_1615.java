package leedecodePregram;
//There is an infrastructure of n cities with some number of roads connecting these cities. Each roads[i] = [ai, bi] indicates that there is a bidirectional road between cities ai and bi.
//
//The network rank of two different cities is defined as the total number of directly connected roads to either city. If a road is directly connected to both cities, it is only counted once.
//
//The maximal network rank of the infrastructure is the maximum network rank of all pairs of different cities.
//
//Given the integer n and the array roads, return the maximal network rank of the entire infrastructure.
//Input: n = 4, roads = [[0,1],[0,3],[1,2],[1,3]]
//Output: 4
//Explanation: The network rank of cities 0 and 1 is 4 as there are 4 roads that are connected to either 0 or 1. The road between 0 and 1 is only counted once
public class Maximal_Network_Rank_1615 {
    public static void main(String[] args) {
        int[][] roads={{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}};
        int n=8;
        System.out.print(maximalNetworkRank(n,roads));
    }
    public static int maximalNetworkRank(int n, int[][] roads) {

        int[] count=new int[n];
        int[][] arr=new int[n][n];

        for(int[] road:roads){
            count[road[0]]++;
            count[road[1]]++;
            arr[road[0]][road[1]]=1;
            arr[road[1]][road[0]]=1;
        }
        int rank=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                rank=Math.max(rank,count[i]+count[j]-arr[i][j]);

            }
        }

        return rank;
    }
}

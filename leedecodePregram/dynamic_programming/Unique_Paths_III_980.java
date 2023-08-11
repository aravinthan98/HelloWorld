package leedecodePregram.dynamic_programming;
//You are given an m x n integer array grid where grid[i][j] could be:
//
//1 representing the starting square. There is exactly one starting square.
//2 representing the ending square. There is exactly one ending square.
//0 representing empty squares we can walk over.
//-1 representing obstacles that we cannot walk over.
//Return the number of 4-directional walks from the
// starting square to the ending square, that walk over every non-obstacle square exactly once.
public class Unique_Paths_III_980 {
    public static void main(String[] args) {
        int[][] grid={{1,0,0,0},{0,0,0,0},{0,0,2,-1}};

        System.out.print(uniquePathsIII(grid));
    }
    public static int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int zeros=0;
        int r=0;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    zeros++;
                }
                if(grid[i][j]==1){
                    r=i;
                    c=j;
                }
            }
        }


        return uniquePathshelper(r, c,grid,zeros);


    }

    public static int uniquePathshelper(int row,int col,int[][] grid,int zeros){

        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]==-1){
            return 0;
        }

        if(grid[row][col]==2){
            return zeros==-1?1:0;
        }
        grid[row][col]=-1;
        zeros--;

        int totalcount= uniquePathshelper(row-1,col,grid,zeros)+
                uniquePathshelper(row+1,col,grid,zeros)+
                uniquePathshelper(row,col-1,grid,zeros)+
                uniquePathshelper(row,col+1,grid,zeros);

        grid[row][col]=0;
        zeros++;
        return totalcount;

    }
}

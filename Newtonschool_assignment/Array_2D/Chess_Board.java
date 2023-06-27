package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//Tom loves Chess boards. He admires its symmetry and how the black and white colors are placed adjacently along both axis.
//More formally, a chessboard-like coloring implies that no two adjacent cells have the same color and all the cells are painted either white or black.
//On his birthday, Tom has been gifted a board which is in the form of an N*N grid. Every cell is painted either black or white. Since Tom loves the placement of colors in a chessboard, he will try to convert the board that has been gifted to him, identical to a chessboard. He has both black and white colors available to him. Help him find out the minimum number of cells he will have to recolor to paint his board similar to a chessboard.
//Input
//The first line contains an integer N, denoting the size of the board
//Each of the next N lines contains N space-separated integers and each integer being either '0' or '1'
//'1' represent black cell
//'0' represents white cell
//
//Constraints
//1 ≤ N ≤ 1000
//Output
//A single integer that is the minimum number of cells that Tom will have to re-color in his board to convert the given board to a chess board like coloring.
//Example
//Input:
//3
//1 1 1
//1 1 1
//1 1 1
//
//Output:
//4
//
//Explanation:
//Convert to
//1 0 1
//0 1 0
//1 0 1
//Thus he has to color 4 cells.
public class Chess_Board {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        chessBoard(arr,n);

        // Your code here
    }
    public static void chessBoard(int[][] arr,int n){
        int count=0;
        int sum=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int size=(i+j)%2;
                if(size==arr[i][j])
                    sum++;
                else
                    count++;

            }
        }
        System.out.print(Math.min(count,sum));

    }
}

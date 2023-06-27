package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//Write a program that creates an N*N matrix. Fill each cell with the sum of row number and column
// number (based on 0 indexes, ie indices begin from base 0), take its transpose and print it.
//Where the transpose of a matrix is a new matrix whose rows and the columns are interchanged
// to that of original matrix.
public class Transpose_of_a_matrix {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int[][] arr=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=i+j;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }                      // Your code here
    }
}

package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//You are given a NxN matrix. You need to find the transpose of the matrix.
//The matrix is of form:
//a b c ...
//d e f ...
//g h i ...
//...........
//There are N elements in each row.
public class Simple_tanspose {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        trans(arr,n);

    }
    public static void trans(int[][] arr,int n){
        int[][] arr1=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=arr[j][i];
            }
        }
        print(arr1,n);
    }
    public static void print(int[][] arr1,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }

}

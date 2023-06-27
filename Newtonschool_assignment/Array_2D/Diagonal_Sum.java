package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//Given a matrix of size N*N, your task is to find the sum of the primary and secondary diagonal of the matrix.
//
//For Matrix:-
//M00 M01 M02
//M10 M11 M12
//M20 M21 M22
//
//Primary diagonal:- M00 M11 M22
//Secondary diagonal:- M02 M11 M20
public class Diagonal_Sum {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        solve(arr,n);              // Your code here
    }
    public static void solve(int[][] arr,int n){
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<=i;j++){
                count +=arr[i][j];
            }
        }
        System.out.print(count+" ");
        for(int i=0;i<n;i++){
            for(int j=n-1-i;j<n-i;j++){
                sum +=arr[i][j];
            }
        }
        System.out.print(sum);

        // Your code here
    }
}

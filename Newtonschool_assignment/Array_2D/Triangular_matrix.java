package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//Given a matrix of size N*N, your task is to find the sum of the upper triangular matrix and the lower triangular matrix.
//
//For Matrix:-
//M00 M01 M02
//M10 M11 M12
//M20 M21 M22
//
//Upper Triangular:-
//M00 M01 M02
//_____M11 M12
//__________M22
//
//Lower Triangular:-
//M00__________
//M10 M11_____
//M20 M21 M22
public class Triangular_matrix {
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
            for(int j=i;j<n;j++){
                count +=arr[i][j];
            }
        }
        System.out.print(count+" ");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                sum +=arr[i][j];
            }
        }
        System.out.print(sum);


    }

}

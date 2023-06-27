package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//You are given a 2X2 square matrix. You need to find the determinant of the matrix
//Sample Input
//4 5
//2 3
//
//Sample Output
//2
public class Simple_Determinant {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][2];

        for(int i=0;i<2;i++ ){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        determinant(arr);
        // Your code here
    }
    public static void determinant(int[][] arr){
        int a=1;
        int b=1;
        for(int i=0;i<2;i++ ){
            for(int j=0;j<2;j++){
                if(i==j){
                    a *=arr[i][j];
                }
                else{
                    b *=arr[i][j];
                }
            }
        }
        System.out.print(a-b);
    }
}

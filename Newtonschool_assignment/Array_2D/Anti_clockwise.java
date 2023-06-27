package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//Given an N*N matrix. Print the elements of the matrix in anticlockwise order
// (see the sample for better understanding).
//Sample Input
//4
//1 2 3 4
//5 6 7 8
//9 10 11 12
//13 14 15 16
//
//Sample output
//1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7
public class Anti_clockwise {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int p1=0;
        int p2=n-1;
        while (p1<=p2) {

            for (int i = p1; i <=p2; i++) {
                System.out.print(arr[i][p1] + " ");
            }
            if (n > 1) {
                for (int i = p1+1; i <=p2; i++) {
                    System.out.print(arr[p2][i] + " ");
                }
            }
            if (n > 1) {
                for (int i = p2-1; i >= p1; i--) {
                    System.out.print(arr[i][p2] + " ");
                }
                for(int i=p2-1;i>p1;i--){
                    System.out.print(arr[p1][i]+" ");
                }
            }
            p1++;
            p2--;
        }
        // Your code here
    }
}

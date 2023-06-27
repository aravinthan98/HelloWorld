package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//Given a NxM 2- D matrix. Print all elements of
// the matrix in clockwise spiral form starting from first row first column.
//Input:
//3 3
//1 2 3
//4 5 6
//7 8 9
//
//Output:
//1 2 3 6 9 8 7 4 5
public class Spiral_Matrix {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int p1=0;
        int p2=n-1;
        int p3=m-1;
        while((p1<=p2)&&(p1<=p3)){
            for (int i = p1; i<=p3; i++) {
                System.out.print(arr[p1][i] + " ");
            }
            if (n > 1){
                for (int i =p1+1; i <=p2; i++) {
                    System.out.print(arr[i][p3] + " ");
                }
            }
            if (n > 1){
                for (int i =p3-1; i >=p1; i--) {
                    System.out.print(arr[p2][i] + " ");
                }
            }
            if(m>1){
                for(int i=p2-1;i>p1;i--){
                    System.out.print(arr[i][p1]+" ");
                }
            }

            p1++;
            p2--;
            p3--;
        }
        // Your code here
    }         // Your
}

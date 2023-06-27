package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//You are given a matrix Mat of m rows and n columns. The matrix is boolean
// so the elements of the matrix can only be either 0 or 1.
//Now, if any row of the matrix contains a 1, then you need to fill that whole row with 1.
// After doing the mentioned operation, you need to print the modified matrix.
//Input:
//1
//5 4
//1 0 0 0
//0 0 0 0
//0 1 0 0
//0 0 0 0
//0 0 0 1
//
//Output:
//1 1 1 1
//0 0 0 0
//1 1 1 1
//0 0 0 0
//1 1 1 1
public class A_Boolean_Matrix_Problem {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            int[][] arr1=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]==1){
                        for(int k=0;k<m;k++){
                            arr1[i][k]=1;
                        }
                        break;
                    }
                }

            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }



        }
        // Your code here
    }
}

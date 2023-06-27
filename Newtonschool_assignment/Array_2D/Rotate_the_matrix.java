package Newtonschool_assignment.Array_2D;

import java.util.Scanner;

//Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degrees
// and 180 degrees.

public class Rotate_the_matrix {
    static void transpose(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];  //3 7
                arr[i][j]=arr[j][i];///4 6
                arr[j][i]=temp;
            }
        }

    }
    static void swaprow(int[][] arr,int n){
        for(int i=0;i<n;i++){
            int le=0;
            int ri=n-1;
            while(le<=ri){
                int temp=arr[i][le];
                arr[i][le]=arr[i][ri];
                arr[i][ri]=temp;
                le++;
                ri--;
            }
        }
    }
    static void rotatearray1(int[][] arr, int n ){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void rotatearray2(int[][] arr, int n){
        transpose(arr ,n);
        swaprow(arr,n);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr,n);
        swaprow(arr,n);
        rotatearray1(arr,n);
        System.out.println();
        rotatearray2(arr,n);


        // Your code here
    }
}

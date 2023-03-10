package arrays;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
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

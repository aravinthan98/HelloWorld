package arrays;

import java.util.Scanner;

public class zigZag {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[][] arr=new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        zigzag(arr,M,N);              // Your code here
    }

    public static void zigzag(int[][] arr,int m,int n) {

            for (int i =0; i<m; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[i-j][j]+" ");

                }
                System.out.println();
            }

            for (int i =0; i<n-1; i++) {
                for (int j = 1; j <n-i; j++) {

                    System.out.print(arr[m- j][i + j] + " ");

                }
                System.out.println();
            }




    }
}

package arrays;

import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
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

    }
}

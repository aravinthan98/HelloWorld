package arrays;

import java.util.Scanner;

public class antiClocktranspose {
    public static void main(String[] args) {
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
        while (p1<p2) {

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
    }
}

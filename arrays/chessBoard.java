package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chessBoard {
    public static void main (String[] args)throws IOException {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
        chessBoard(arr,n);

        // Your code here
    }
    public static void chessBoard(int[][] arr,int n){
        int count=0;
        int sum=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int size=(i+j)%2;
                if(size==arr[i][j])
                    sum++;
                else
                    count++;


            }
        }
        System.out.print(Math.min(count,sum));

    }
}


package arrays;


import java.util.Scanner;

public class Maximum1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] arr=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        int high=0;
        for(int i=0;i<N;i++){
            int max=0;
            for(int j=0;j<M;j++){
                max+=arr[i][j];
                if(count<max){
                    count=max;
                    high=i;
                }

            }
        }
        System.out.print(high);


    }
}

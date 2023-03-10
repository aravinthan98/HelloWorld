package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class maxFlag {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] arr = new int[M];
            for (int i = 0; i < M; i++) {
                arr[i] = sc.nextInt();
            }
            flage(arr, N);
            System.out.println();
        }
    }
    public static void flage(int[] arr, int N){

            int[] ar1=new int[N];
            int count=0;

            for(int i=0;i<arr.length;i++){

                if(arr[i]<=N){
                    count =arr[i]-1;// 0 0 1 0 0,  0 0 1 1 0,  0 0 1 2 0,
                    ar1[count]=ar1[count]+1;
                }
                else{
                    Arrays.sort(ar1); //
                    for(int j=0;j<N;j++){
                        ar1[j]=ar1[N-1];
                    }
                }
            }
            for(int k=0;k<ar1.length;k++){
                System.out.print(ar1[k]+" ");
            }// Your code here
    }
}

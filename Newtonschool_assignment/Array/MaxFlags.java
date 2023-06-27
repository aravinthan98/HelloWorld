package Newtonschool_assignment.Array;

import java.util.Arrays;
import java.util.Scanner;

//You are given N flags, initially set to 0. Now you have to perform two operations on them:
//1. Increase(F) by 1: flag F is increased by 1.
//2. max_flag: all flags are set to a maximum value of any flag.
//A non-empty array arr[] will be given of size M. This array represents consecutive operations:
//a) If arr[K] = F, such that 1 <= F <= N then operation K is Increase(F).
//b) If arr[K] = N+1 then operation K is max_flag.
//
//The goal is to calculate the value of every flag after all operations.
public class MaxFlags {
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
                count =arr[i]-1;
                ar1[count]=ar1[count]+1;
            }
            else{
                Arrays.sort(ar1); //0 0 0 1 2
                for(int j=0;j<N;j++){
                    ar1[j]=ar1[N-1]; //3 2 2 4 2
                }
            }
        }
        for(int k=0;k<ar1.length;k++){
            System.out.print(ar1[k]+" ");
        }// Your code here        // Your code here
    }
}

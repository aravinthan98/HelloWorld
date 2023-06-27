package Newtonschool_assignment.Array;

import java.util.Scanner;

//Mohit has an array of N integers containing all elements from 1 to N, somehow he lost
// one element from the array.
//Given N-1 elements your task is to find the missing one.
public class Mohit_and_array {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n - 1];

        for (int i = 0; i < n-1; i++) {
            arr[i] = scn.nextInt();
        }
        missing(arr,n);
    }
    public static void missing(int[] arr,int N){
        int sum=(N*(N+1))/2;

        int cursum=0;
        for(int num:arr){
            cursum+=num;
        }

        System.out.print(sum-cursum);
        // Your code here
    }
}

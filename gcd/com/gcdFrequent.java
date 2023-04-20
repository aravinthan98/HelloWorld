package gcd.com;

import java.util.Scanner;

public class gcdFrequent {
    public static void main (String[] args) {
        // Your code here


        int n = 6;
        int[] arr = {3,6,6,9,3,3};

        System.out.println(gcdFreq(arr,n));
    }

    public static int gcdFreq(int[] arr, int n){

        int ans =0;
        for(int i=0; i<n; i++){

            int count = 0;

            for(int j=0; j<n; j++ ){

                if(arr[i]==arr[j]){
                    count++;

                }
            }
            int k = arr[i];
            ans += gcd(k,count);
        }
        return ans ;
    }
    public static int gcd(int a, int b){

        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}

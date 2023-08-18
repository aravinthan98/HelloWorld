package leedecodePregram;

import java.util.HashMap;
import java.util.Scanner;

public class Subarray_Sum_Equals_K_560 {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){

            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(countsubarray(arr,n,k));
        }
        // Your code here
    }
    public static int countsubarray(int[]arr,int n,int k){
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int sum=0;
        int max=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(map.containsKey(sum-k)){
                max+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return max;

    }
}

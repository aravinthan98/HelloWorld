package arrays;

import java.util.Scanner;

public class Donation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        solv(arr);


    }
    public static void solv(int[] arr){
        int[] extraAmount=new int[arr.length];
        int currentMoney=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>currentMoney){
                currentMoney=arr[j];
                extraAmount[j]=0;
            }
            else{
                extraAmount[j]= currentMoney-arr[j];
            }
        }
        printArray(extraAmount);
        System.out.println();
        long collection=sumArray(arr)+sumArray(extraAmount);
        System.out.println(collection);
    }
    static void printArray(int[] arr){
        for(int k=0;k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    static long sumArray(int[] arr){
        long sum=0;
        for(int l=0;l<arr.length;l++){
            sum +=arr[l];

        }
        return sum;
    }
}

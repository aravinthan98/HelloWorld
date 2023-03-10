package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class mohitMissing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n - 1];
        boolean count=false;
        for (int i = 0; i < n-1; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);

        for(int i=1;i<=arr.length;i++){
            if(arr[i-1]!=i){
                count=true;
                System.out.print(i);
                break;
            }

        }
        if(!count){
            System.out.print(n);
        }
    }
}

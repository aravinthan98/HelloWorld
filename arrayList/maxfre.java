package arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class maxfre {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int max = maxFreq(arr,n);
        System.out.print(max);
    }
    public static int maxFreq(int[] arr, int n){
        Arrays.sort(arr);
        int max = 1;
        int cur_max = 1;

        for(int i=0;i<n;i++){
            if(arr[i]==arr[i+1]){   // 1 1 1 4 4 4 4 5 5 5 5
                max++;              // 4
            }else{
                i =i+1;            //3
            }

        }
        return max;
    }
}

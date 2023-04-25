package arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class maxfre {
    public static void main (String[] args) {

        int n = 10;
        int[] arr = {2,4,6,2,2,4,4,4,6,6};
//        for(int i=0;i<n;i++){
//            arr[i] = scn.nextInt();
//        }
        int max = maxFreq(arr,n);
        System.out.print(max);
    }
    public static int maxFreq(int[] arr, int n){
        Arrays.sort(arr);
        int max = 1;
        int cur_max = 1;
        int num=0;

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){   // 1 1 1 4 4 4 4 5 5 5 5
                max++;              // 4
            }else{

                if(cur_max<max){
                     cur_max=max;
                     num=arr[i];
                     max=1;//3
                }

            }

        }
        return num;
    }
}

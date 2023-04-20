package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sample {
    public static void main(String[] args) {
         int[] arr={0,2,5,3,8};
        Arrays.parallelSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }



    }
}

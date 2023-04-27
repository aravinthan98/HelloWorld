import util.com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {

        int[] arr = {4, 2, 5, 3, 8, 12, 1};

        int n = arr.length;
        quicksort(arr,0,n-1);

        util.printArrays(arr);
    }
    public static void quicksort(int []arr,int l,int h) {
        if(l<h){
            int p=partition(arr,l,h);
            quicksort(arr,l,p-1);
            quicksort(arr,p+1,h);
        }

    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=(low-1);

        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

}

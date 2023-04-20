package sorting;

import util.com.util;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 6, 9, 7, 3};
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            int low = i;

            for(int j = i + 1; j < n; ++j) {
                if (arr[low] > arr[j]) {
                    low = j;
                }
            }

            swap(arr, low, i);
        }

        util.printArrays(arr);
    }

    public static int[] swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}

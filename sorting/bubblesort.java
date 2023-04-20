package sorting;

import util.com.util;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 6, 9, 7, 3};
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
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

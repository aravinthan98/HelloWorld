package sorting;

import util.com.util;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 6, 9, 7, 3};//1 3 4 5 6 7 9
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        util.printArrays(arr);
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}

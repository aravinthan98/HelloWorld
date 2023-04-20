package sorting;

import util.com.util;

import java.util.Arrays;

public class sortArrayInWaveForm {
        public static void main(String[] args) {
            int[] arr = new int[]{5, 4, 1, 6, 9, 7, 3};
            int n = arr.length;
            Arrays.sort(arr);
            wavesort(arr, n);
            util.printArrays(arr);
        }

        public static int[] wavesort(int[] arr, int n) {
            for(int i = 0; i < n - 1; i += 2) {
                swap(arr, i, i + 1);
            }

            return arr;
        }

        public static int[] swap(int[] arr, int a, int b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            return arr;
        }

    }

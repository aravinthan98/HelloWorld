package sorting;

import util.com.util;


public class insertionsort {

        public static void main(String[] args) {
            int[] arr = {5, 4, 1, 6, 9, 7, 3};
            int n = arr.length;
            sortElement(arr, n);
            util.printArrays(arr);
        }

        public static int[] sortElement(int[] arr, int n) {
            for(int i = 1; i < n; ++i) {
                for(int j = i; j > 0; --j) {
                    if (arr[j] < arr[j - 1]) {
                        swap(arr, j, j - 1);
                    }
                }
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

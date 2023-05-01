package sorting;

import util.com.util;


public class insertionsort {

        public static void main(String[] args) {
            int[] arr = {5, 4, 1, 6, 9, 7, 3};// 4 5 1
            int n = arr.length;
            sortElement(arr, n);
            util.printArrays(arr);
        }

        public static int[] sortElement(int[] arr, int n) {
            for(int i = 1; i < n; ++i) {
                int key=arr[i];//1
                int j=i-1;//5

                while(j>=0 && arr[j]>key) {
                        arr[j+1] =arr[j]; // 1  5
                        j=j-1;
                }
                arr[j+1]=key;
            }

            return arr;
        }


}

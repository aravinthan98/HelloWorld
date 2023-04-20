package sorting;

import util.com.util;

public class mergsort {
    static int count;

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        divideArray(arr, 0, n - 1);
        util.printArrays(arr);
    }

    public static void divideArray(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            divideArray(arr, l, mid);
            divideArray(arr, mid + 1, r);
            mergearray(arr, l, mid, r);
        }

    }

    public static void mergearray(int[] arr, int l, int mid, int r) {
        int[] merge = new int[r - l + 1];
        int p1 = l;
        int p2 = mid + 1;
        int x = 0;

        while(p1 <= mid && p2 <= r) {
            if (arr[p1] <= arr[p2]) {
                merge[x++] = arr[p1++];
            } else {
                merge[x++] = arr[p2++];
            }
        }

        while(p1 <= mid) {
            merge[x++] = arr[p1++];
        }

        while(p2 <= r) {
            merge[x++] = arr[p2++];
        }

        int i = 0;

        for(int j = l; i < merge.length; ++j) {
            arr[j] = merge[i];
            ++i;
        }

    }
}

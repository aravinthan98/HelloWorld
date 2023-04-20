package arrayList;

import util.com.util;

import java.util.ArrayList;

public class sort1s2s0s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};//indes=5 [0 0 1 1 1 2]
//        int n = arr.length;
//        ArrayList<Integer> list = new ArrayList<>();
//        int index = 0;//9
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 2) {
//                list.add(arr[i]);
//            } else if (arr[i] == 1) {
//                list.add(index, arr[i]);
//                index++;
//            } else if (arr[i] == 0) {
//                list.add(0, arr[i]);//0 0 0 0 0 1 1 1 1 1 2 2
//
//                index++;
//
//            }
//        }
//
//            System.out.print(list);
        int l=0;
        int h= arr.length-1;
        int mid=0;
        while (mid<=h) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[mid];
                    arr[mid] = arr[l];
                    arr[l] = temp;
                    l++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[h];
                    arr[h] = temp;
                    h--;
                    break;
            }

        }
        util.printArrays(arr);


    }
}

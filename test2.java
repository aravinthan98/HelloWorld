import java.util.HashSet;

public class test2 {
    //    public static void main(String[] args) {
//        int[] arr={-90,80,0,2,-8,0,1};
//        int n=arr.length-1;
//
//        splitarray(arr,0,n);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
    public static int[] splitarray(int[] arr, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;

            splitarray(arr, l, mid);
            splitarray(arr, mid + 1, h);
            mergearray(arr, l, mid, h);


        }
        return arr;
    }

    public static int[] mergearray(int[] arr, int l, int mid, int h) {
        int p = l;
        int p1 = mid + 1;
        int[] merge = new int[h - l + 1];
        int x = 0;
        while (p <= mid && p1 <= h) {
            if (arr[p] <= arr[p1]) {
                merge[x++] = arr[p++];
            } else {
                merge[x++] = arr[p1++];
            }
        }
        while (p <= mid) {
            merge[x++] = arr[p++];
        }
        while (p1 <= h) {
            merge[x++] = arr[p1++];
        }
        int i = 0;
        for (int j = l; i < merge.length; i++, j++) {
            arr[j] = merge[i];

        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {1,5,10,15,7};
        int target = 5;
        HashSet set = new HashSet<>();

        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int key = target - arr[i];
//            if (set.contains(key)) {
//                count++;
//                set.add(arr[i]);
//            } else {
//                set.add(arr[i]);
//            }
//
//        }
//        System.out.print(count);
        for (int i = 0;  i<arr.length ; i++) {
            int key=arr[i];
            int sum=target^key;
            if(set.contains(sum)){
                count++;
                set.add(key);
            }
            else{
                set.add(key);
            }

        }
        System.out.println(count);

    }

}
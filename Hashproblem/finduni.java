package Hashproblem;

import java.util.HashMap;
import java.util.Map;

public class finduni {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2};
        int n = arr.length;

        int sum=0;
        for(int i=0;i<n;i++){
            sum^=arr[i];
        }
        System.out.println(sum);

//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//
//
//        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
//            if (it.getValue() == 1) {
//                System.out.print(it.getKey());
//            }
//        }

    }
}
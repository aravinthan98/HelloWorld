package leedecodePregram;

import java.util.Arrays;
import java.util.HashMap;

public class Top_K_FrequentElements_347 {
    public static void main(String[] args) {
 //       int[] arr={5,1,-1,-8,-7,8,-5,0,1,10,8,0,-4,3,-1,-1,4,-5,4,-3,0,2,2,2,4,-2,-4,8,-7,-7,2,-8,0,-8,10,8,-8,-2,-9,4,-7,6,6,-1,4,2,8,-3,5,-9,-3,6,-8,-5,5,10,2,-5,-1,-5,1,-3,7,0,8,-2,-3,-1,-5,4,7,-9,0,2,10,4,4,-4,-1,-1,6,-8,-9,-1,9,-9,3,5,1,6,-1,-2,4,2,4,-6,4,4,5,-5};
        int[] arr={1,1,1,2,2,3};
        int k=2;

        int[] narr=topKFrequent(arr,k);
        for(int i=narr.length-1;i>= narr.length-k;i--){
            System.out.print(narr[i]+" ");
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] keyarr=new int[map.size()];
        int[] valarr=new int[map.size()];


//        String[] arr = new String[map.size()];
        int i=0;
        for(int key:map.keySet()){
            keyarr[i] = key;
            valarr[i] = map.get(key);
            i++;
        }
        bubbleSort(keyarr,valarr);

//        Arrays.sort(arr);
//        int[] ansarr=new int[k];
//        int q=0;
//        for(int l=arr.length-1;l>=0;l--) {
//            int ind = arr[l].indexOf('a');
//            int num = Integer.parseInt(arr[l].substring(ind + 1));
//            if (q < k) {
//                ansarr[q++] = num;
//            }
//        }
//        System.out.print(map);
//        System.out.print(Arrays.toString(arr));
        return keyarr;//[4,-1,2,-5,-8,0,8]
    }
    public static void bubbleSort(int[] keyarr,int[] valarr) {
        int n = valarr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (valarr[j] > valarr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = valarr[j];
                    valarr[j] = valarr[j + 1];
                    valarr[j + 1] = temp;
                    int temp2=keyarr[j];
                    keyarr[j] = keyarr[j + 1];
                    keyarr[j + 1] = temp2;
                }
            }
        }
    }
}
